package typings.distributions.distributionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("distributions", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def Binomial(properbility: Double, size: Double): Distribution = js.native
  def Normal(): Distribution = js.native
  def Normal(mean: Double): Distribution = js.native
  def Normal(mean: Double, sd: Double): Distribution = js.native
  def Studentt(df: Double): Distribution = js.native
  def Uniform(): Distribution = js.native
  def Uniform(a: Double): Distribution = js.native
  def Uniform(a: Double, b: Double): Distribution = js.native
}

