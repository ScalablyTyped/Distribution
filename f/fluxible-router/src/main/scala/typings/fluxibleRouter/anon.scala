package typings.fluxibleRouter

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.fluxibleRouter.mod.RouteStore
import typings.react.mod.Component
import typings.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object anon extends js.Object {
  @js.native
  trait TypeofComponent
    extends Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ js.Any, 
          Component[js.Object, js.Object, js.Object]
        ] {
    // tslint won't let me format the sample code in a way that vscode likes it :(
    /**
      * If set, `this.context` will be set at runtime to the current value of the given Context.
      *
      * Usage:
      *
      * ```ts
      * type MyContext = number
      * const Ctx = React.createContext<MyContext>(0)
      *
      * class Foo extends React.Component {
      *   static contextType = Ctx
      *   context!: React.ContextType<typeof Ctx>
      *   render () {
      *     return <>My context's value: {this.context}</>;
      *   }
      * }
      * ```
      *
      * @see https://reactjs.org/docs/context.html#classcontexttype
      */
    var contextType: js.UndefOr[Context[_]] = js.native
  }
  
  @js.native
  trait TypeofRouteStore extends Instantiable0[RouteStore] {
    def withStaticRoutes(routes: js.Object): /* import warning: importer.ImportType#apply Failed type conversion: typeof RouteStore */ js.Any = js.native
  }
  
}

