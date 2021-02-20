package typings.firebaseDatabase.anon

import typings.firebaseDatabase.queryMod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofTESTACCESS extends StObject {
  
  def forceRestClient(forceRestClient: Boolean): Unit = js.native
  
  def hijackHash(newHash: js.Function0[String]): js.Function0[Unit] = js.native
  
  def queryIdentifier(query: Query): String = js.native
}
object TypeofTESTACCESS {
  
  @scala.inline
  def apply(
    forceRestClient: Boolean => Unit,
    hijackHash: js.Function0[String] => js.Function0[Unit],
    queryIdentifier: Query => String
  ): TypeofTESTACCESS = {
    val __obj = js.Dynamic.literal(forceRestClient = js.Any.fromFunction1(forceRestClient), hijackHash = js.Any.fromFunction1(hijackHash), queryIdentifier = js.Any.fromFunction1(queryIdentifier))
    __obj.asInstanceOf[TypeofTESTACCESS]
  }
  
  @scala.inline
  implicit class TypeofTESTACCESSMutableBuilder[Self <: TypeofTESTACCESS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForceRestClient(value: Boolean => Unit): Self = StObject.set(x, "forceRestClient", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHijackHash(value: js.Function0[String] => js.Function0[Unit]): Self = StObject.set(x, "hijackHash", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQueryIdentifier(value: Query => String): Self = StObject.set(x, "queryIdentifier", js.Any.fromFunction1(value))
  }
}
