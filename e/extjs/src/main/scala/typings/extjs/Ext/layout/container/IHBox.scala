package typings.extjs.Ext.layout.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHBox
  extends StObject
     with IBox {
  
  /** [Config Option] (String) */
  var align: js.UndefOr[String] = js.undefined
  
  /** [Config Option] ("round"/"floor"/"ceil") */
  var alignRoundingMethod: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (Boolean) */
  var constrainAlign: js.UndefOr[Boolean] = js.undefined
}
object IHBox {
  
  @scala.inline
  def apply(): IHBox = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHBox]
  }
  
  @scala.inline
  implicit class IHBoxMutableBuilder[Self <: IHBox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignRoundingMethod(value: js.Any): Self = StObject.set(x, "alignRoundingMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignRoundingMethodUndefined: Self = StObject.set(x, "alignRoundingMethod", js.undefined)
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setConstrainAlign(value: Boolean): Self = StObject.set(x, "constrainAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstrainAlignUndefined: Self = StObject.set(x, "constrainAlign", js.undefined)
  }
}
