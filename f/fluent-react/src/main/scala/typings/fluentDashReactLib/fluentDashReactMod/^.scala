package typings
package fluentDashReactLib.fluentDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fluent-react", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def withLocalization(
    component: reactLib.reactMod.ComponentClass[Matching[InjectedProps, GetProps[_]], reactLib.reactMod.ComponentState]
  ): reactLib.reactMod.ComponentType[
    Omit[
      GetProps[
        reactLib.reactMod.ComponentClass[Matching[InjectedProps, GetProps[_]], reactLib.reactMod.ComponentState]
      ], 
      java.lang.String
    ]
  ] = js.native
  def withLocalization(component: reactLib.reactMod.FunctionComponent[Matching[InjectedProps, GetProps[_]]]): reactLib.reactMod.ComponentType[
    Omit[
      GetProps[reactLib.reactMod.FunctionComponent[Matching[InjectedProps, GetProps[_]]]], 
      java.lang.String
    ]
  ] = js.native
}

