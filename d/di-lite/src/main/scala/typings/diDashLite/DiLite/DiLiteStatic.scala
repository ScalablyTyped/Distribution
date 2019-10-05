package typings.diDashLite.DiLite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiLiteStatic extends js.Object {
  var factory: FactoryEnum
  var strategy: StrategyEnum
  var utils: Utils
  var version: String
  def createContext(): CreateContext
  def dependencyExpression(depExp: String): String
  def entry(name: String, ctx: CreateContext): js.Any
}

object DiLiteStatic {
  @scala.inline
  def apply(
    createContext: () => CreateContext,
    dependencyExpression: String => String,
    entry: (String, CreateContext) => js.Any,
    factory: FactoryEnum,
    strategy: StrategyEnum,
    utils: Utils,
    version: String
  ): DiLiteStatic = {
    val __obj = js.Dynamic.literal(createContext = js.Any.fromFunction0(createContext), dependencyExpression = js.Any.fromFunction1(dependencyExpression), entry = js.Any.fromFunction2(entry), factory = factory, strategy = strategy, utils = utils, version = version)
  
    __obj.asInstanceOf[DiLiteStatic]
  }
}

