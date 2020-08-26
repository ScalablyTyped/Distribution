package typings.ejWebAll.ej.Tile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveTile extends js.Object {
  /** Specifies whether to enable liveTile or not.
    * @Default {false}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /** Specifies liveTile images in CSS classes.
    * @Default {null}
    */
  var imageClass: js.UndefOr[js.Array[_]] = js.native
  /** Specifies liveTile images in templates.
    * @Default {null}
    */
  var imageTemplateId: js.UndefOr[js.Array[_]] = js.native
  /** Specifies liveTile images in CSS classes.
    * @Default {null}
    */
  var imageUrl: js.UndefOr[js.Array[_]] = js.native
  /** Sets the text to each living tile
    * @Default {Null}
    */
  var text: js.UndefOr[js.Array[_]] = js.native
  /** Specifies liveTile type for Tile. See orientation
    * @Default {flip}
    */
  var `type`: js.UndefOr[liveTileType | String] = js.native
  /** Specifies time interval between two successive liveTile animation
    * @Default {2000}
    */
  var updateInterval: js.UndefOr[Double] = js.native
}

object LiveTile {
  @scala.inline
  def apply(): LiveTile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveTile]
  }
  @scala.inline
  implicit class LiveTileOps[Self <: LiveTile] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setImageClassVarargs(value: js.Any*): Self = this.set("imageClass", js.Array(value :_*))
    @scala.inline
    def setImageClass(value: js.Array[_]): Self = this.set("imageClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageClass: Self = this.set("imageClass", js.undefined)
    @scala.inline
    def setImageTemplateIdVarargs(value: js.Any*): Self = this.set("imageTemplateId", js.Array(value :_*))
    @scala.inline
    def setImageTemplateId(value: js.Array[_]): Self = this.set("imageTemplateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageTemplateId: Self = this.set("imageTemplateId", js.undefined)
    @scala.inline
    def setImageUrlVarargs(value: js.Any*): Self = this.set("imageUrl", js.Array(value :_*))
    @scala.inline
    def setImageUrl(value: js.Array[_]): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageUrl: Self = this.set("imageUrl", js.undefined)
    @scala.inline
    def setTextVarargs(value: js.Any*): Self = this.set("text", js.Array(value :_*))
    @scala.inline
    def setText(value: js.Array[_]): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setType(value: liveTileType | String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUpdateInterval(value: Double): Self = this.set("updateInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateInterval: Self = this.set("updateInterval", js.undefined)
  }
  
}

