package typings.extjs.Ext.data

import typings.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IIdGenerator
  extends StObject
     with IBase {
  
  /** [Method] Generates and returns the next id
    * @returns String The next id.
    */
  var generate: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Config Option] (String) */
  var id: js.UndefOr[String] = js.undefined
  
  /** [Property] (Boolean) */
  var isGenerator: js.UndefOr[Boolean] = js.undefined
}
object IIdGenerator {
  
  @scala.inline
  def apply(): IIdGenerator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IIdGenerator]
  }
  
  @scala.inline
  implicit class IIdGeneratorMutableBuilder[Self <: IIdGenerator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGenerate(value: () => String): Self = StObject.set(x, "generate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGenerateUndefined: Self = StObject.set(x, "generate", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIsGenerator(value: Boolean): Self = StObject.set(x, "isGenerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsGeneratorUndefined: Self = StObject.set(x, "isGenerator", js.undefined)
  }
}
