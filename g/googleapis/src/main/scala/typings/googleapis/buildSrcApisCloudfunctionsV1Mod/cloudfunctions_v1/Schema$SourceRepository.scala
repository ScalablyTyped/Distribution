package typings.googleapis.buildSrcApisCloudfunctionsV1Mod.cloudfunctions_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes SourceRepository, used to represent parameters related to source
  * repository where a function is hosted.
  */
@js.native
trait Schema$SourceRepository extends js.Object {
  /**
    * Output only. The URL pointing to the hosted repository where the function
    * were defined at the time of deployment. It always points to a specific
    * commit in the format described above.
    */
  var deployedUrl: js.UndefOr[String] = js.native
  /**
    * The URL pointing to the hosted repository where the function is defined.
    * There are supported Cloud Source Repository URLs in the following
    * formats:  To refer to a specific commit:
    * `https://source.developers.google.com/projects/x/repos/x/revisions/x/paths/x
    * To refer to a moveable alias (branch):
    * `https://source.developers.google.com/projects/x/repos/x/moveable-aliases/x/paths/x
    * In particular, to refer to HEAD use `master` moveable alias. To refer to
    * a specific fixed alias (tag):
    * `https://source.developers.google.com/projects/x/repos/x/fixed-aliases/x/paths/x
    * You may omit `paths/x if you want to use the main directory.
    */
  var url: js.UndefOr[String] = js.native
}

object Schema$SourceRepository {
  @scala.inline
  def apply(deployedUrl: String = null, url: String = null): Schema$SourceRepository = {
    val __obj = js.Dynamic.literal()
    if (deployedUrl != null) __obj.updateDynamic("deployedUrl")(deployedUrl.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SourceRepository]
  }
}

