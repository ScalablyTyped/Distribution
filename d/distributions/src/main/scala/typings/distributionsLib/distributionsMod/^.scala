package typings
package distributionsLib.distributionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("distributions", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def Binomial(properbility: scala.Double, size: scala.Double): distributionsLib.distributionsMod.Distribution = js.native
  def Normal(): distributionsLib.distributionsMod.Distribution = js.native
  def Normal(mean: scala.Double): distributionsLib.distributionsMod.Distribution = js.native
  def Normal(mean: scala.Double, sd: scala.Double): distributionsLib.distributionsMod.Distribution = js.native
  def Studentt(df: scala.Double): distributionsLib.distributionsMod.Distribution = js.native
  def Uniform(): distributionsLib.distributionsMod.Distribution = js.native
  def Uniform(a: scala.Double): distributionsLib.distributionsMod.Distribution = js.native
  def Uniform(a: scala.Double, b: scala.Double): distributionsLib.distributionsMod.Distribution = js.native
}

