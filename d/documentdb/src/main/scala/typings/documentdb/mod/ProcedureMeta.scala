package typings.documentdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcedureMeta
  extends StObject
     with AbstractMeta {
  
  var body: String
}
object ProcedureMeta {
  
  @scala.inline
  def apply(_self: String, _ts: Double, body: String, id: String): ProcedureMeta = {
    val __obj = js.Dynamic.literal(_self = _self.asInstanceOf[js.Any], _ts = _ts.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcedureMeta]
  }
  
  @scala.inline
  implicit class ProcedureMetaMutableBuilder[Self <: ProcedureMeta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
