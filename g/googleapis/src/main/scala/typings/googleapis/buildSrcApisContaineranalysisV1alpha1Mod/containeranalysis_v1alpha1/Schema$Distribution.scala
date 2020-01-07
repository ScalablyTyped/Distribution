package typings.googleapis.buildSrcApisContaineranalysisV1alpha1Mod.containeranalysis_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This represents a particular channel of distribution for a given package.
  * e.g. Debian&#39;s jessie-backports dpkg mirror
  */
@js.native
trait Schema$Distribution extends js.Object {
  /**
    * The CPU architecture for which packages in this distribution channel were
    * built
    */
  var architecture: js.UndefOr[String] = js.native
  /**
    * The cpe_uri in [cpe format](https://cpe.mitre.org/specification/)
    * denoting the package manager version distributing a package.
    */
  var cpeUri: js.UndefOr[String] = js.native
  /**
    * The distribution channel-specific description of this package.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The latest available version of this package in this distribution
    * channel.
    */
  var latestVersion: js.UndefOr[Schema$Version] = js.native
  /**
    * A freeform string denoting the maintainer of this package.
    */
  var maintainer: js.UndefOr[String] = js.native
  /**
    * The distribution channel-specific homepage for this package.
    */
  var url: js.UndefOr[String] = js.native
}

object Schema$Distribution {
  @scala.inline
  def apply(
    architecture: String = null,
    cpeUri: String = null,
    description: String = null,
    latestVersion: Schema$Version = null,
    maintainer: String = null,
    url: String = null
  ): Schema$Distribution = {
    val __obj = js.Dynamic.literal()
    if (architecture != null) __obj.updateDynamic("architecture")(architecture.asInstanceOf[js.Any])
    if (cpeUri != null) __obj.updateDynamic("cpeUri")(cpeUri.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (latestVersion != null) __obj.updateDynamic("latestVersion")(latestVersion.asInstanceOf[js.Any])
    if (maintainer != null) __obj.updateDynamic("maintainer")(maintainer.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Distribution]
  }
}

