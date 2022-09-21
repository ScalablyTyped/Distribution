package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.Right
import typings.devextreme.devextremeStrings.`bottom center`
import typings.devextreme.devextremeStrings.`bottom left`
import typings.devextreme.devextremeStrings.`bottom right`
import typings.devextreme.devextremeStrings.`down-push`
import typings.devextreme.devextremeStrings.`down-stack`
import typings.devextreme.devextremeStrings.`left center`
import typings.devextreme.devextremeStrings.`left-push`
import typings.devextreme.devextremeStrings.`left-stack`
import typings.devextreme.devextremeStrings.`right center`
import typings.devextreme.devextremeStrings.`right-push`
import typings.devextreme.devextremeStrings.`right-stack`
import typings.devextreme.devextremeStrings.`top center`
import typings.devextreme.devextremeStrings.`top left`
import typings.devextreme.devextremeStrings.`top right`
import typings.devextreme.devextremeStrings.`up-push`
import typings.devextreme.devextremeStrings.`up-stack`
import typings.devextreme.devextremeStrings.center
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stack extends StObject {
  
  /**
    * 
    */
  var direction: js.UndefOr[
    `down-push` | `up-push` | `left-push` | `right-push` | `down-stack` | `up-stack` | `left-stack` | `right-stack`
  ] = js.undefined
  
  /**
    * 
    */
  var position: js.UndefOr[
    (`top left`) | (`top right`) | (`bottom left`) | (`bottom right`) | (`top center`) | (`bottom center`) | (`left center`) | (`right center`) | center | Right
  ] = js.undefined
}
object Stack {
  
  inline def apply(): Stack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Stack]
  }
  
  extension [Self <: Stack](x: Self) {
    
    inline def setDirection(
      value: `down-push` | `up-push` | `left-push` | `right-push` | `down-stack` | `up-stack` | `left-stack` | `right-stack`
    ): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setPosition(
      value: (`top left`) | (`top right`) | (`bottom left`) | (`bottom right`) | (`top center`) | (`bottom center`) | (`left center`) | (`right center`) | center | Right
    ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
