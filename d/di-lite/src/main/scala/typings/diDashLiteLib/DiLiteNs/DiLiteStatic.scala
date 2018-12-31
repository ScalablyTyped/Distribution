package typings
package diDashLiteLib.DiLiteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiLiteStatic extends js.Object {
  var factory: FactoryEnum
  var strategy: StrategyEnum
  var utils: Utils
  var version: java.lang.String
  def createContext(): CreateContext
  def dependencyExpression(depExp: java.lang.String): java.lang.String
  def entry(name: java.lang.String, ctx: CreateContext): js.Any
}

