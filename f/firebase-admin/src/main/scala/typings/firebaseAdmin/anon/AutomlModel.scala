package typings.firebaseAdmin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutomlModel extends StObject {
  
  var automlModel: String
}
object AutomlModel {
  
  inline def apply(automlModel: String): AutomlModel = {
    val __obj = js.Dynamic.literal(automlModel = automlModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutomlModel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutomlModel] (val x: Self) extends AnyVal {
    
    inline def setAutomlModel(value: String): Self = StObject.set(x, "automlModel", value.asInstanceOf[js.Any])
  }
}
