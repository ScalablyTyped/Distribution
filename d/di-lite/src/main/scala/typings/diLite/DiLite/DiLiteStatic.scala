package typings.diLite.DiLite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiLiteStatic extends js.Object {
  var factory: FactoryEnum = js.native
  var strategy: StrategyEnum = js.native
  var utils: Utils = js.native
  var version: String = js.native
  def createContext(): CreateContext = js.native
  def dependencyExpression(depExp: String): String = js.native
  def entry(name: String, ctx: CreateContext): js.Any = js.native
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
    val __obj = js.Dynamic.literal(createContext = js.Any.fromFunction0(createContext), dependencyExpression = js.Any.fromFunction1(dependencyExpression), entry = js.Any.fromFunction2(entry), factory = factory.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any], utils = utils.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiLiteStatic]
  }
  @scala.inline
  implicit class DiLiteStaticOps[Self <: DiLiteStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreateContext(value: () => CreateContext): Self = this.set("createContext", js.Any.fromFunction0(value))
    @scala.inline
    def setDependencyExpression(value: String => String): Self = this.set("dependencyExpression", js.Any.fromFunction1(value))
    @scala.inline
    def setEntry(value: (String, CreateContext) => js.Any): Self = this.set("entry", js.Any.fromFunction2(value))
    @scala.inline
    def setFactory(value: FactoryEnum): Self = this.set("factory", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrategy(value: StrategyEnum): Self = this.set("strategy", value.asInstanceOf[js.Any])
    @scala.inline
    def setUtils(value: Utils): Self = this.set("utils", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

