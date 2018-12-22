package typings
package envDashCiLib.envDashCiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object envCiNs {
  type CiEnv = NonCiEnv | KnownCiEnv
  type KnownCiEnv = AppveyorEnv | BambooEnv | BitbucketEnv | BitriseEnv | BuddyEnv | BuildkiteEnv | CircleCiEnv | CirrusEnv | CodeBuildEnv | CodefreshEnv | CodeshipEnv | DroneEnv | GitLabEnv | JenkinsEnv | SailEnv | SemaphoreEnv | ShippableEnv | TeamCityEnv | TravisEnv | VstsEnv | WerckerEnv
}
