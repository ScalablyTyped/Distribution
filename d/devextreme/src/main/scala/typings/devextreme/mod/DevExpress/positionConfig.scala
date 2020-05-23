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
import scala.scalajs.js.annotation._

trait positionConfig extends js.Object {
  /** @name positionConfig.at */
  var at: js.UndefOr[
    bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | X
  ] = js.undefined
  /** @name positionConfig.boundary */
  var boundary: js.UndefOr[String | Element | JQuery | Window] = js.undefined
  /** @name positionConfig.boundaryOffset */
  var boundaryOffset: js.UndefOr[String | Y] = js.undefined
  /** @name positionConfig.collision */
  var collision: js.UndefOr[
    fit | (`fit flip`) | (`fit flipfit`) | (`fit none`) | flip | (`flip fit`) | (`flip none`) | flipfit | (`flipfit fit`) | (`flipfit none`) | none | (`none fit`) | (`none flip`) | (`none flipfit`) | XY
  ] = js.undefined
  /** @name positionConfig.my */
  var my: js.UndefOr[
    bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | X
  ] = js.undefined
  /** @name positionConfig.of */
  var of: js.UndefOr[String | Element | JQuery | Window] = js.undefined
  /** @name positionConfig.offset */
  var offset: js.UndefOr[String | Y] = js.undefined
}

object positionConfig {
  @scala.inline
  def apply(
    at: bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | X = null,
    boundary: String | Element | JQuery | Window = null,
    boundaryOffset: String | Y = null,
    collision: fit | (`fit flip`) | (`fit flipfit`) | (`fit none`) | flip | (`flip fit`) | (`flip none`) | flipfit | (`flipfit fit`) | (`flipfit none`) | none | (`none fit`) | (`none flip`) | (`none flipfit`) | XY = null,
    my: bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | X = null,
    of: String | Element | JQuery | Window = null,
    offset: String | Y = null
  ): positionConfig = {
    val __obj = js.Dynamic.literal()
    if (at != null) __obj.updateDynamic("at")(at.asInstanceOf[js.Any])
    if (boundary != null) __obj.updateDynamic("boundary")(boundary.asInstanceOf[js.Any])
    if (boundaryOffset != null) __obj.updateDynamic("boundaryOffset")(boundaryOffset.asInstanceOf[js.Any])
    if (collision != null) __obj.updateDynamic("collision")(collision.asInstanceOf[js.Any])
    if (my != null) __obj.updateDynamic("my")(my.asInstanceOf[js.Any])
    if (of != null) __obj.updateDynamic("of")(of.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[positionConfig]
  }
}

