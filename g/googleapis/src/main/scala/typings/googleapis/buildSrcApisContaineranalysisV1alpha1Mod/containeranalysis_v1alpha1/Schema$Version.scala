package typings.googleapis.buildSrcApisContaineranalysisV1alpha1Mod.containeranalysis_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Version contains structured information about the version of the package.
  * For a discussion of this in Debian/Ubuntu:
  * http://serverfault.com/questions/604541/debian-packages-version-convention
  * For a discussion of this in Redhat/Fedora/Centos:
  * http://blog.jasonantman.com/2014/07/how-yum-and-rpm-compare-versions/
  */
@js.native
trait Schema$Version extends js.Object {
  /**
    * Used to correct mistakes in the version numbering scheme.
    */
  var epoch: js.UndefOr[Double] = js.native
  /**
    * Distinguish between sentinel MIN/MAX versions and normal versions. If
    * kind is not NORMAL, then the other fields are ignored.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The main part of the version name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The iteration of the package build from the above version.
    */
  var revision: js.UndefOr[String] = js.native
}

object Schema$Version {
  @scala.inline
  def apply(epoch: Int | Double = null, kind: String = null, name: String = null, revision: String = null): Schema$Version = {
    val __obj = js.Dynamic.literal()
    if (epoch != null) __obj.updateDynamic("epoch")(epoch.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (revision != null) __obj.updateDynamic("revision")(revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Version]
  }
}

