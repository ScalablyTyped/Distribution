package typings.dynmap.mod

import typings.dynmap.mod.leafletAugmentingMod.CustomIcon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorldMapConfiguration extends StObject {
  
  var azimuth: Double
  
  var background: Null
  
  var backgroundday: Null
  
  var backgroundnight: Null
  
  var bigmap: Boolean
  
  var boostzoom: Double
  
  var compassview: CompassDirection
  
  var icon: js.UndefOr[String | CustomIcon | Null] = js.undefined
  
  var `image-format`: ImageFormat
  
  var inclination: Double
  
  var lighting: String
  
  var maptoworld: WorldMapConversion
  
  var mapzoomin: Double
  
  var mapzoomout: Double
  
  var name: String
  
  var nightandday: Boolean
  
  var perspective: String
  
  var prefix: String
  
  var `protected`: Boolean
  
  var scale: Double
  
  var shader: String
  
  var title: String
  
  var `type`: String
  
  var worldtomap: WorldMapConversion
}
object WorldMapConfiguration {
  
  inline def apply(
    azimuth: Double,
    background: Null,
    backgroundday: Null,
    backgroundnight: Null,
    bigmap: Boolean,
    boostzoom: Double,
    compassview: CompassDirection,
    `image-format`: ImageFormat,
    inclination: Double,
    lighting: String,
    maptoworld: WorldMapConversion,
    mapzoomin: Double,
    mapzoomout: Double,
    name: String,
    nightandday: Boolean,
    perspective: String,
    prefix: String,
    `protected`: Boolean,
    scale: Double,
    shader: String,
    title: String,
    `type`: String,
    worldtomap: WorldMapConversion
  ): WorldMapConfiguration = {
    val __obj = js.Dynamic.literal(azimuth = azimuth.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], backgroundday = backgroundday.asInstanceOf[js.Any], backgroundnight = backgroundnight.asInstanceOf[js.Any], bigmap = bigmap.asInstanceOf[js.Any], boostzoom = boostzoom.asInstanceOf[js.Any], compassview = compassview.asInstanceOf[js.Any], inclination = inclination.asInstanceOf[js.Any], lighting = lighting.asInstanceOf[js.Any], maptoworld = maptoworld.asInstanceOf[js.Any], mapzoomin = mapzoomin.asInstanceOf[js.Any], mapzoomout = mapzoomout.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nightandday = nightandday.asInstanceOf[js.Any], perspective = perspective.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], shader = shader.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], worldtomap = worldtomap.asInstanceOf[js.Any])
    __obj.updateDynamic("image-format")(`image-format`.asInstanceOf[js.Any])
    __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorldMapConfiguration]
  }
  
  extension [Self <: WorldMapConfiguration](x: Self) {
    
    inline def setAzimuth(value: Double): Self = StObject.set(x, "azimuth", value.asInstanceOf[js.Any])
    
    inline def setBackground(value: Null): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundday(value: Null): Self = StObject.set(x, "backgroundday", value.asInstanceOf[js.Any])
    
    inline def setBackgroundnight(value: Null): Self = StObject.set(x, "backgroundnight", value.asInstanceOf[js.Any])
    
    inline def setBigmap(value: Boolean): Self = StObject.set(x, "bigmap", value.asInstanceOf[js.Any])
    
    inline def setBoostzoom(value: Double): Self = StObject.set(x, "boostzoom", value.asInstanceOf[js.Any])
    
    inline def setCompassview(value: CompassDirection): Self = StObject.set(x, "compassview", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: String | CustomIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconNull: Self = StObject.set(x, "icon", null)
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def `setImage-format`(value: ImageFormat): Self = StObject.set(x, "image-format", value.asInstanceOf[js.Any])
    
    inline def setInclination(value: Double): Self = StObject.set(x, "inclination", value.asInstanceOf[js.Any])
    
    inline def setLighting(value: String): Self = StObject.set(x, "lighting", value.asInstanceOf[js.Any])
    
    inline def setMaptoworld(value: WorldMapConversion): Self = StObject.set(x, "maptoworld", value.asInstanceOf[js.Any])
    
    inline def setMapzoomin(value: Double): Self = StObject.set(x, "mapzoomin", value.asInstanceOf[js.Any])
    
    inline def setMapzoomout(value: Double): Self = StObject.set(x, "mapzoomout", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNightandday(value: Boolean): Self = StObject.set(x, "nightandday", value.asInstanceOf[js.Any])
    
    inline def setPerspective(value: String): Self = StObject.set(x, "perspective", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setProtected(value: Boolean): Self = StObject.set(x, "protected", value.asInstanceOf[js.Any])
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setShader(value: String): Self = StObject.set(x, "shader", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWorldtomap(value: WorldMapConversion): Self = StObject.set(x, "worldtomap", value.asInstanceOf[js.Any])
  }
}
