package typings.googleMapsReact.mod

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-maps-react", "GoogleApiWrapper")
@js.native
object GoogleApiWrapper extends js.Object {
  
  def apply(opts: GoogleApiOptionsFunc): js.Function1[
    /* ctor */ ComponentType[IProvidedProps], 
    ComponentType[Omit[IProvidedProps, IProvidedProps]]
  ] = js.native
  def apply(opts: IGoogleApiOptions): js.Function1[
    /* ctor */ ComponentType[IProvidedProps], 
    ComponentType[Omit[IProvidedProps, IProvidedProps]]
  ] = js.native
}
