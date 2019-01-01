package typings
package distributionsLib.distributionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Distribution extends js.Object {
  def cdf(x: scala.Double): scala.Double
  def inv(p: scala.Double): scala.Double
  def mean(): scala.Double
  def median(): scala.Double
  def pdf(x: scala.Double): scala.Double
  def variance(): scala.Double
}

