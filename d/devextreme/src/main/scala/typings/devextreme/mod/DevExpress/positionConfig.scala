package typings.devextreme.mod.DevExpress

import typings.devextreme.AnonX
import typings.devextreme.AnonXY
import typings.devextreme.AnonY
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
import typings.devextreme.mod._Global_.JQuery
import typings.std.Element
import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait positionConfig extends js.Object {
  /** @name positionConfig.at */
  var at: js.UndefOr[
    bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | AnonX
  ] = js.undefined
  /** @name positionConfig.boundary */
  var boundary: js.UndefOr[String | Element | JQuery | Window_] = js.undefined
  /** @name positionConfig.boundaryOffset */
  var boundaryOffset: js.UndefOr[String | AnonY] = js.undefined
  /** @name positionConfig.collision */
  var collision: js.UndefOr[
    fit | (`fit flip`) | (`fit flipfit`) | (`fit none`) | flip | (`flip fit`) | (`flip none`) | flipfit | (`flipfit fit`) | (`flipfit none`) | none | (`none fit`) | (`none flip`) | (`none flipfit`) | AnonXY
  ] = js.undefined
  /** @name positionConfig.my */
  var my: js.UndefOr[
    bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | AnonX
  ] = js.undefined
  /** @name positionConfig.of */
  var of: js.UndefOr[String | Element | JQuery | Window_] = js.undefined
  /** @name positionConfig.offset */
  var offset: js.UndefOr[String | AnonY] = js.undefined
}

object positionConfig {
  @scala.inline
  def apply(
    at: bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | AnonX = null,
    boundary: String | Element | JQuery | Window_ = null,
    boundaryOffset: String | AnonY = null,
    collision: fit | (`fit flip`) | (`fit flipfit`) | (`fit none`) | flip | (`flip fit`) | (`flip none`) | flipfit | (`flipfit fit`) | (`flipfit none`) | none | (`none fit`) | (`none flip`) | (`none flipfit`) | AnonXY = null,
    my: bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | AnonX = null,
    of: String | Element | JQuery | Window_ = null,
    offset: String | AnonY = null
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

