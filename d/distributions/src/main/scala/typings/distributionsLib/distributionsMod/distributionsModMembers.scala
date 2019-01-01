package typings
package distributionsLib.distributionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("distributions", JSImport.Namespace)
@js.native
object distributionsModMembers extends js.Object {
  def Binomial(properbility: scala.Double, size: scala.Double): Distribution = js.native
  def Normal(): Distribution = js.native
  def Normal(mean: scala.Double): Distribution = js.native
  def Normal(mean: scala.Double, sd: scala.Double): Distribution = js.native
  def Studentt(df: scala.Double): Distribution = js.native
  def Uniform(): Distribution = js.native
  def Uniform(a: scala.Double): Distribution = js.native
  def Uniform(a: scala.Double, b: scala.Double): Distribution = js.native
}

