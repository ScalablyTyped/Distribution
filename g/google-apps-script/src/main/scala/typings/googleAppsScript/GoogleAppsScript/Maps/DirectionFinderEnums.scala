package typings.googleAppsScript.GoogleAppsScript.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A collection of enums used by DirectionFinder.
  */
@js.native
trait DirectionFinderEnums extends js.Object {
  var Avoid: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Avoid */ js.Any = js.native
  var Mode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Mode */ js.Any = js.native
}

object DirectionFinderEnums {
  @scala.inline
  def apply(
    Avoid: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Avoid */ js.Any,
    Mode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Mode */ js.Any
  ): DirectionFinderEnums = {
    val __obj = js.Dynamic.literal(Avoid = Avoid.asInstanceOf[js.Any], Mode = Mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionFinderEnums]
  }
  @scala.inline
  implicit class DirectionFinderEnumsOps[Self <: DirectionFinderEnums] (val x: Self) extends AnyVal {
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
    def setAvoid(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Avoid */ js.Any): Self = this.set("Avoid", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Mode */ js.Any): Self = this.set("Mode", value.asInstanceOf[js.Any])
  }
  
}

