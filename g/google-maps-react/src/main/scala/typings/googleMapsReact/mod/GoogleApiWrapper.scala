package typings.googleMapsReact.mod

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-maps-react", "GoogleApiWrapper")
@js.native
object GoogleApiWrapper extends js.Object {
  def apply(opts: GoogleApiOptions): js.Function1[
    /* ctor */ ComponentType[ProvidedProps], 
    ComponentType[Omit[ProvidedProps, ProvidedProps]]
  ] = js.native
  def apply(opts: GoogleApiOptionsFunc): js.Function1[
    /* ctor */ ComponentType[ProvidedProps], 
    ComponentType[Omit[ProvidedProps, ProvidedProps]]
  ] = js.native
}

