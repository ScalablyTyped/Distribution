package typings.devextreme.mod.DevExpress

import typings.devextreme.anon.X
import typings.devextreme.anon.XY
import typings.devextreme.anon.Y
import typings.devextreme.devextremeStrings.`fit flip`
import typings.devextreme.devextremeStrings.`fit flipfit`
import typings.devextreme.devextremeStrings.`fit none`
import typings.devextreme.devextremeStrings.`flip fit`
import typings.devextreme.devextremeStrings.`flip none`
import typings.devextreme.devextremeStrings.`flipfit fit`
import typings.devextreme.devextremeStrings.`flipfit none`
import typings.devextreme.devextremeStrings.`left bottom`
import typings.devextreme.devextremeStrings.`left top`
import typings.devextreme.devextremeStrings.`none fit`
import typings.devextreme.devextremeStrings.`none flip`
import typings.devextreme.devextremeStrings.`none flipfit`
import typings.devextreme.devextremeStrings.`right bottom`
import typings.devextreme.devextremeStrings.`right top`
import typings.devextreme.devextremeStrings.bottom
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.fit
import typings.devextreme.devextremeStrings.flip
import typings.devextreme.devextremeStrings.flipfit
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.top
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait positionConfig extends js.Object {
  
  /**
    * [descr:positionConfig.at]
    */
  var at: js.UndefOr[
    bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | X
  ] = js.native
  
  /**
    * [descr:positionConfig.boundary]
    */
  var boundary: js.UndefOr[String | Element | JQuery | Window] = js.native
  
  /**
    * [descr:positionConfig.boundaryOffset]
    */
  var boundaryOffset: js.UndefOr[String | Y] = js.native
  
  /**
    * [descr:positionConfig.collision]
    */
  var collision: js.UndefOr[
    fit | (`fit flip`) | (`fit flipfit`) | (`fit none`) | flip | (`flip fit`) | (`flip none`) | flipfit | (`flipfit fit`) | (`flipfit none`) | none | (`none fit`) | (`none flip`) | (`none flipfit`) | XY
  ] = js.native
  
  /**
    * [descr:positionConfig.my]
    */
  var my: js.UndefOr[
    bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | X
  ] = js.native
  
  /**
    * [descr:positionConfig.of]
    */
  var of: js.UndefOr[String | Element | JQuery | Window] = js.native
  
  /**
    * [descr:positionConfig.offset]
    */
  var offset: js.UndefOr[String | Y] = js.native
}
object positionConfig {
  
  @scala.inline
  def apply(): positionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[positionConfig]
  }
  
  @scala.inline
  implicit class positionConfigOps[Self <: positionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAt(
      value: bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | X
    ): Self = this.set("at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAt: Self = this.set("at", js.undefined)
    
    @scala.inline
    def setBoundary(value: String | Element | JQuery | Window): Self = this.set("boundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundary: Self = this.set("boundary", js.undefined)
    
    @scala.inline
    def setBoundaryOffset(value: String | Y): Self = this.set("boundaryOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundaryOffset: Self = this.set("boundaryOffset", js.undefined)
    
    @scala.inline
    def setCollision(
      value: fit | (`fit flip`) | (`fit flipfit`) | (`fit none`) | flip | (`flip fit`) | (`flip none`) | flipfit | (`flipfit fit`) | (`flipfit none`) | none | (`none fit`) | (`none flip`) | (`none flipfit`) | XY
    ): Self = this.set("collision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollision: Self = this.set("collision", js.undefined)
    
    @scala.inline
    def setMy(
      value: bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | X
    ): Self = this.set("my", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMy: Self = this.set("my", js.undefined)
    
    @scala.inline
    def setOf(value: String | Element | JQuery | Window): Self = this.set("of", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOf: Self = this.set("of", js.undefined)
    
    @scala.inline
    def setOffset(value: String | Y): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
  }
}
