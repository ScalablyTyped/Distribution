package typings.googleMapReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def convertNeSwToNwSe(boundCorder: typings.googleMapReact.anon.Ne): typings.googleMapReact.anon.Nw = typings.googleMapReact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("convertNeSwToNwSe")(boundCorder.asInstanceOf[js.Any]).asInstanceOf[typings.googleMapReact.anon.Nw]

@scala.inline
def convertNwSeToNeSw(boundCorder: typings.googleMapReact.anon.Nw): typings.googleMapReact.anon.Ne = typings.googleMapReact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("convertNwSeToNeSw")(boundCorder.asInstanceOf[js.Any]).asInstanceOf[typings.googleMapReact.anon.Ne]

@scala.inline
def fitBounds(bounds: typings.googleMapReact.mod.NESWBounds, size: typings.googleMapReact.mod.Size): typings.googleMapReact.anon.Center = (typings.googleMapReact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fitBounds")(bounds.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[typings.googleMapReact.anon.Center]

@scala.inline
def getTilesIds(start: typings.googleMapReact.anon.From, zoom: scala.Double): js.Array[typings.googleMapReact.mod.Tile] = (typings.googleMapReact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getTilesIds")(start.asInstanceOf[js.Any], zoom.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.googleMapReact.mod.Tile]]

@scala.inline
def latLng2Tile(coords: typings.googleMapReact.mod.Coords, zoom: scala.Double): typings.googleMapReact.anon.Point = (typings.googleMapReact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("latLng2Tile")(coords.asInstanceOf[js.Any], zoom.asInstanceOf[js.Any])).asInstanceOf[typings.googleMapReact.anon.Point]

@scala.inline
def meters2ScreenPixels(meters: scala.Double, coords: typings.googleMapReact.mod.Coords, zoom: scala.Double): typings.googleMapReact.anon.H = (typings.googleMapReact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("meters2ScreenPixels")(meters.asInstanceOf[js.Any], coords.asInstanceOf[js.Any], zoom.asInstanceOf[js.Any])).asInstanceOf[typings.googleMapReact.anon.H]

@scala.inline
def tile2LatLng(point: typings.googleMapReact.mod.Point, zoom: scala.Double): typings.googleMapReact.anon.Coords = (typings.googleMapReact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("tile2LatLng")(point.asInstanceOf[js.Any], zoom.asInstanceOf[js.Any])).asInstanceOf[typings.googleMapReact.anon.Coords]

type BootstrapURLKeys = (typings.googleMapReact.anon.Key | typings.googleMapReact.anon.Client) & typings.googleMapReact.anon.Language

type googleMapReact = typings.react.mod.Component[typings.googleMapReact.mod.Props, js.Object, js.Any]
