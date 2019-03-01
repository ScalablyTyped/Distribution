package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bannerwithcontentcontainer extends js.Object {
  var banner_with_content_container: js.UndefOr[Anon_FillColorArgb] = js.undefined
  var subTitle: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var totalVolumes: js.UndefOr[scala.Double] = js.undefined
  var uid: js.UndefOr[java.lang.String] = js.undefined
  var volumes: js.UndefOr[js.Array[gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs.Volume]] = js.undefined
}

object Anon_Bannerwithcontentcontainer {
  @scala.inline
  def apply(
    banner_with_content_container: Anon_FillColorArgb = null,
    subTitle: java.lang.String = null,
    title: java.lang.String = null,
    totalVolumes: scala.Int | scala.Double = null,
    uid: java.lang.String = null,
    volumes: js.Array[gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs.Volume] = null
  ): Anon_Bannerwithcontentcontainer = {
    val __obj = js.Dynamic.literal()
    if (banner_with_content_container != null) __obj.updateDynamic("banner_with_content_container")(banner_with_content_container)
    if (subTitle != null) __obj.updateDynamic("subTitle")(subTitle)
    if (title != null) __obj.updateDynamic("title")(title)
    if (totalVolumes != null) __obj.updateDynamic("totalVolumes")(totalVolumes.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid)
    if (volumes != null) __obj.updateDynamic("volumes")(volumes)
    __obj.asInstanceOf[Anon_Bannerwithcontentcontainer]
  }
}

