package typings.dxf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dxfMod {
  
  @js.native
  sealed trait UnitTypes extends StObject
  @JSImport("dxf/Common", "UnitTypes")
  @js.native
  object UnitTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[UnitTypes & Double] = js.native
    
    @js.native
    sealed trait Angstroms
      extends StObject
         with UnitTypes
    /* 11 */ val Angstroms: typings.dxf.dxfMod.UnitTypes.Angstroms & Double = js.native
    
    @js.native
    sealed trait AstronomicalUnits
      extends StObject
         with UnitTypes
    /* 18 */ val AstronomicalUnits: typings.dxf.dxfMod.UnitTypes.AstronomicalUnits & Double = js.native
    
    @js.native
    sealed trait Centimeters
      extends StObject
         with UnitTypes
    /* 5 */ val Centimeters: typings.dxf.dxfMod.UnitTypes.Centimeters & Double = js.native
    
    @js.native
    sealed trait Decameters
      extends StObject
         with UnitTypes
    /* 15 */ val Decameters: typings.dxf.dxfMod.UnitTypes.Decameters & Double = js.native
    
    @js.native
    sealed trait Decimeters
      extends StObject
         with UnitTypes
    /* 14 */ val Decimeters: typings.dxf.dxfMod.UnitTypes.Decimeters & Double = js.native
    
    @js.native
    sealed trait Feet
      extends StObject
         with UnitTypes
    /* 2 */ val Feet: typings.dxf.dxfMod.UnitTypes.Feet & Double = js.native
    
    @js.native
    sealed trait Gigameters
      extends StObject
         with UnitTypes
    /* 17 */ val Gigameters: typings.dxf.dxfMod.UnitTypes.Gigameters & Double = js.native
    
    @js.native
    sealed trait Hectometers
      extends StObject
         with UnitTypes
    /* 16 */ val Hectometers: typings.dxf.dxfMod.UnitTypes.Hectometers & Double = js.native
    
    @js.native
    sealed trait Inches
      extends StObject
         with UnitTypes
    /* 1 */ val Inches: typings.dxf.dxfMod.UnitTypes.Inches & Double = js.native
    
    @js.native
    sealed trait Kilometers
      extends StObject
         with UnitTypes
    /* 7 */ val Kilometers: typings.dxf.dxfMod.UnitTypes.Kilometers & Double = js.native
    
    @js.native
    sealed trait LightYears
      extends StObject
         with UnitTypes
    /* 19 */ val LightYears: typings.dxf.dxfMod.UnitTypes.LightYears & Double = js.native
    
    @js.native
    sealed trait Meters
      extends StObject
         with UnitTypes
    /* 6 */ val Meters: typings.dxf.dxfMod.UnitTypes.Meters & Double = js.native
    
    @js.native
    sealed trait Microinches
      extends StObject
         with UnitTypes
    /* 8 */ val Microinches: typings.dxf.dxfMod.UnitTypes.Microinches & Double = js.native
    
    @js.native
    sealed trait Microns
      extends StObject
         with UnitTypes
    /* 13 */ val Microns: typings.dxf.dxfMod.UnitTypes.Microns & Double = js.native
    
    @js.native
    sealed trait Miles
      extends StObject
         with UnitTypes
    /* 3 */ val Miles: typings.dxf.dxfMod.UnitTypes.Miles & Double = js.native
    
    @js.native
    sealed trait Millimeters
      extends StObject
         with UnitTypes
    /* 4 */ val Millimeters: typings.dxf.dxfMod.UnitTypes.Millimeters & Double = js.native
    
    @js.native
    sealed trait Mils
      extends StObject
         with UnitTypes
    /* 9 */ val Mils: typings.dxf.dxfMod.UnitTypes.Mils & Double = js.native
    
    @js.native
    sealed trait Nanometers
      extends StObject
         with UnitTypes
    /* 12 */ val Nanometers: typings.dxf.dxfMod.UnitTypes.Nanometers & Double = js.native
    
    @js.native
    sealed trait Parsec
      extends StObject
         with UnitTypes
    /* 20 */ val Parsec: typings.dxf.dxfMod.UnitTypes.Parsec & Double = js.native
    
    @js.native
    sealed trait Unitless
      extends StObject
         with UnitTypes
    /* 0 */ val Unitless: typings.dxf.dxfMod.UnitTypes.Unitless & Double = js.native
    
    @js.native
    sealed trait Yards
      extends StObject
         with UnitTypes
    /* 10 */ val Yards: typings.dxf.dxfMod.UnitTypes.Yards & Double = js.native
  }
  
  type ColorNumber = js.Tuple3[Double, Double, Double]
  
  type ColorNumbers = js.Array[ColorNumber]
  
  trait Point2D extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Point2D {
    
    inline def apply(x: Double, y: Double): Point2D = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point2D]
    }
    
    extension [Self <: Point2D](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Point3D
    extends StObject
       with Point2D {
    
    var z: Double
  }
  object Point3D {
    
    inline def apply(x: Double, y: Double, z: Double): Point3D = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point3D]
    }
    
    extension [Self <: Point3D](x: Self) {
      
      inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
}
