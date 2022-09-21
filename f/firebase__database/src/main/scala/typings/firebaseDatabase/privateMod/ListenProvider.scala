package typings.firebaseDatabase.privateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListenProvider extends StObject {
  
  def startListening(
    query: QueryContext,
    tag: Double,
    hashFn: js.Function0[String],
    onComplete: js.Function2[/* a */ String, /* b */ js.UndefOr[Any], js.Array[Event2]]
  ): js.Array[Event2] = js.native
  def startListening(
    query: QueryContext,
    tag: Null,
    hashFn: js.Function0[String],
    onComplete: js.Function2[/* a */ String, /* b */ js.UndefOr[Any], js.Array[Event2]]
  ): js.Array[Event2] = js.native
  
  def stopListening(a: QueryContext): Unit = js.native
  def stopListening(a: QueryContext, b: Double): Unit = js.native
}
