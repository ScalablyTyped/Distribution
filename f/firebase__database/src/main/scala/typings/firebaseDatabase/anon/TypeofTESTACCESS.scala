package typings.firebaseDatabase.anon

import typings.firebaseDatabase.queryMod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTESTACCESS extends StObject {
  
  def forceRestClient(forceRestClient: Boolean): Unit
  
  def hijackHash(newHash: js.Function0[String]): js.Function0[Unit]
  
  def queryIdentifier(query: Query): String
}
object TypeofTESTACCESS {
  
  inline def apply(
    forceRestClient: Boolean => Unit,
    hijackHash: js.Function0[String] => js.Function0[Unit],
    queryIdentifier: Query => String
  ): TypeofTESTACCESS = {
    val __obj = js.Dynamic.literal(forceRestClient = js.Any.fromFunction1(forceRestClient), hijackHash = js.Any.fromFunction1(hijackHash), queryIdentifier = js.Any.fromFunction1(queryIdentifier))
    __obj.asInstanceOf[TypeofTESTACCESS]
  }
  
  extension [Self <: TypeofTESTACCESS](x: Self) {
    
    inline def setForceRestClient(value: Boolean => Unit): Self = StObject.set(x, "forceRestClient", js.Any.fromFunction1(value))
    
    inline def setHijackHash(value: js.Function0[String] => js.Function0[Unit]): Self = StObject.set(x, "hijackHash", js.Any.fromFunction1(value))
    
    inline def setQueryIdentifier(value: Query => String): Self = StObject.set(x, "queryIdentifier", js.Any.fromFunction1(value))
  }
}
