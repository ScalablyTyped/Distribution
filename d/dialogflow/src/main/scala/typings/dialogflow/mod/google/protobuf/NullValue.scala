package typings.dialogflow.mod.google.protobuf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NullValue extends StObject
/** NullValue enum. */
@JSImport("dialogflow/protos/protos", "google.protobuf.NullValue")
@js.native
object NullValue extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NullValue & Double] = js.native
  
  @js.native
  sealed trait NULL_VALUE
    extends StObject
       with NullValue
  /* 0 */ val NULL_VALUE: typings.dialogflow.mod.google.protobuf.NullValue.NULL_VALUE & Double = js.native
}
