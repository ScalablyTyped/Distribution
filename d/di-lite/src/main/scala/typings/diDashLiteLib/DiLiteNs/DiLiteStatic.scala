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

object DiLiteStatic {
  @scala.inline
  def apply(
    createContext: js.Function0[CreateContext],
    dependencyExpression: js.Function1[java.lang.String, java.lang.String],
    entry: js.Function2[java.lang.String, CreateContext, js.Any],
    factory: FactoryEnum,
    strategy: StrategyEnum,
    utils: Utils,
    version: java.lang.String
  ): DiLiteStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createContext")(createContext)
    __obj.updateDynamic("dependencyExpression")(dependencyExpression)
    __obj.updateDynamic("entry")(entry)
    __obj.updateDynamic("factory")(factory)
    __obj.updateDynamic("strategy")(strategy)
    __obj.updateDynamic("utils")(utils)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[DiLiteStatic]
  }
}

