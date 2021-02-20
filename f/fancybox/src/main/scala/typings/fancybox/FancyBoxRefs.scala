package typings.fancybox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FancyBoxRefs extends StObject {
  
  var bg: JQuery = js.native
  
  var caption: JQuery = js.native
  
  var container: JQuery = js.native
  
  var infobar: JQuery = js.native
  
  var inner: JQuery = js.native
  
  var navigation: JQuery = js.native
  
  var stage: JQuery = js.native
  
  var toolbar: JQuery = js.native
}
object FancyBoxRefs {
  
  @scala.inline
  def apply(
    bg: JQuery,
    caption: JQuery,
    container: JQuery,
    infobar: JQuery,
    inner: JQuery,
    navigation: JQuery,
    stage: JQuery,
    toolbar: JQuery
  ): FancyBoxRefs = {
    val __obj = js.Dynamic.literal(bg = bg.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], infobar = infobar.asInstanceOf[js.Any], inner = inner.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], toolbar = toolbar.asInstanceOf[js.Any])
    __obj.asInstanceOf[FancyBoxRefs]
  }
  
  @scala.inline
  implicit class FancyBoxRefsMutableBuilder[Self <: FancyBoxRefs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBg(value: JQuery): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption(value: JQuery): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainer(value: JQuery): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfobar(value: JQuery): Self = StObject.set(x, "infobar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInner(value: JQuery): Self = StObject.set(x, "inner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigation(value: JQuery): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStage(value: JQuery): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbar(value: JQuery): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
  }
}
