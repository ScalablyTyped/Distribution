package typings.googleapis

import typings.googleapis.buildSrcApisBooksV1Mod.books_v1.Schema$Volume
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Bannerwithcontentcontainer extends js.Object {
  var banner_with_content_container: js.UndefOr[Anon_FillColorArgb] = js.native
  var subTitle: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var totalVolumes: js.UndefOr[Double] = js.native
  var uid: js.UndefOr[String] = js.native
  var volumes: js.UndefOr[js.Array[Schema$Volume]] = js.native
}

object Anon_Bannerwithcontentcontainer {
  @scala.inline
  def apply(
    banner_with_content_container: Anon_FillColorArgb = null,
    subTitle: String = null,
    title: String = null,
    totalVolumes: Int | Double = null,
    uid: String = null,
    volumes: js.Array[Schema$Volume] = null
  ): Anon_Bannerwithcontentcontainer = {
    val __obj = js.Dynamic.literal()
    if (banner_with_content_container != null) __obj.updateDynamic("banner_with_content_container")(banner_with_content_container.asInstanceOf[js.Any])
    if (subTitle != null) __obj.updateDynamic("subTitle")(subTitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (totalVolumes != null) __obj.updateDynamic("totalVolumes")(totalVolumes.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (volumes != null) __obj.updateDynamic("volumes")(volumes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Bannerwithcontentcontainer]
  }
}

