package typings.googleMapsReact

import typings.googleMapsReact.mod.InfoWindowProps
import typings.googleMapsReact.mod.MarkerProps
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object googleMapsReactComponents extends googleMapsReactProps {
  @scala.inline
  def Circle: ComponentType[js.Any] = js.constructorOf[typings.googleMapsReact.mod.Circle].asInstanceOf[ComponentType[js.Any]]
  @scala.inline
  def HeatMap: ComponentType[js.Any] = js.constructorOf[typings.googleMapsReact.mod.HeatMap].asInstanceOf[ComponentType[js.Any]]
  @scala.inline
  def InfoWindow[P /* <: InfoWindowProps */, S]: ComponentType[P] = (js.constructorOf[typings.googleMapsReact.mod.InfoWindow[P, S]]).asInstanceOf[ComponentType[P]]
  @scala.inline
  def Map: ComponentType[MapProps] = js.constructorOf[typings.googleMapsReact.mod.Map].asInstanceOf[ComponentType[MapProps]]
  @scala.inline
  def Marker[P /* <: MarkerProps */, S]: ComponentType[P] = (js.constructorOf[typings.googleMapsReact.mod.Marker[P, S]]).asInstanceOf[ComponentType[P]]
  @scala.inline
  def Polygon: ComponentType[js.Any] = js.constructorOf[typings.googleMapsReact.mod.Polygon].asInstanceOf[ComponentType[js.Any]]
  @scala.inline
  def Polyline: ComponentType[js.Any] = js.constructorOf[typings.googleMapsReact.mod.Polyline].asInstanceOf[ComponentType[js.Any]]
}

