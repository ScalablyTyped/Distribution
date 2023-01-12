package typings.fancybox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FancyBoxRefs extends StObject {
  
  var bg: JQuery
  
  var caption: JQuery
  
  var container: JQuery
  
  var infobar: JQuery
  
  var inner: JQuery
  
  var navigation: JQuery
  
  var stage: JQuery
  
  var toolbar: JQuery
}
object FancyBoxRefs {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: FancyBoxRefs] (val x: Self) extends AnyVal {
    
    inline def setBg(value: JQuery): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
    
    inline def setCaption(value: JQuery): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setContainer(value: JQuery): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setInfobar(value: JQuery): Self = StObject.set(x, "infobar", value.asInstanceOf[js.Any])
    
    inline def setInner(value: JQuery): Self = StObject.set(x, "inner", value.asInstanceOf[js.Any])
    
    inline def setNavigation(value: JQuery): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    inline def setStage(value: JQuery): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    inline def setToolbar(value: JQuery): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
  }
}
