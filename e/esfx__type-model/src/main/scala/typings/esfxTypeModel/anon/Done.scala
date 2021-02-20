package typings.esfxTypeModel.anon

import typings.esfxTypeModel.esfxTypeModelBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Done extends StObject {
  
  var done: `false` = js.native
  
  var value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any = js.native
}
object Done {
  
  @scala.inline
  def apply(
    done: `false`,
    value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
  ): Done = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Done]
  }
  
  @scala.inline
  implicit class DoneMutableBuilder[Self <: Done] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDone(value: `false`): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
