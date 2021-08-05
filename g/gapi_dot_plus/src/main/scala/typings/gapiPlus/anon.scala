package typings.gapiPlus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CoverInfo extends StObject {
    
    var coverInfo: LeftImageOffset
    
    var coverPhoto: Height
    
    var layout: String
  }
  object CoverInfo {
    
    inline def apply(coverInfo: LeftImageOffset, coverPhoto: Height, layout: String): CoverInfo = {
      val __obj = js.Dynamic.literal(coverInfo = coverInfo.asInstanceOf[js.Any], coverPhoto = coverPhoto.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
      __obj.asInstanceOf[CoverInfo]
    }
    
    extension [Self <: CoverInfo](x: Self) {
      
      inline def setCoverInfo(value: LeftImageOffset): Self = StObject.set(x, "coverInfo", value.asInstanceOf[js.Any])
      
      inline def setCoverPhoto(value: Height): Self = StObject.set(x, "coverPhoto", value.asInstanceOf[js.Any])
      
      inline def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    }
  }
  
  trait Department extends StObject {
    
    var department: String
    
    var description: String
    
    var endDate: String
    
    var location: String
    
    var name: String
    
    var primary: Boolean
    
    var startDate: String
    
    var title: String
    
    var `type`: String
  }
  object Department {
    
    inline def apply(
      department: String,
      description: String,
      endDate: String,
      location: String,
      name: String,
      primary: Boolean,
      startDate: String,
      title: String,
      `type`: String
    ): Department = {
      val __obj = js.Dynamic.literal(department = department.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Department]
    }
    
    extension [Self <: Department](x: Self) {
      
      inline def setDepartment(value: String): Self = StObject.set(x, "department", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait FamilyName extends StObject {
    
    var familyName: String
    
    var formatted: String
    
    var givenName: String
    
    var honorificPrefix: String
    
    var honorificSuffix: String
    
    var middleName: String
  }
  object FamilyName {
    
    inline def apply(
      familyName: String,
      formatted: String,
      givenName: String,
      honorificPrefix: String,
      honorificSuffix: String,
      middleName: String
    ): FamilyName = {
      val __obj = js.Dynamic.literal(familyName = familyName.asInstanceOf[js.Any], formatted = formatted.asInstanceOf[js.Any], givenName = givenName.asInstanceOf[js.Any], honorificPrefix = honorificPrefix.asInstanceOf[js.Any], honorificSuffix = honorificSuffix.asInstanceOf[js.Any], middleName = middleName.asInstanceOf[js.Any])
      __obj.asInstanceOf[FamilyName]
    }
    
    extension [Self <: FamilyName](x: Self) {
      
      inline def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
      
      inline def setFormatted(value: String): Self = StObject.set(x, "formatted", value.asInstanceOf[js.Any])
      
      inline def setGivenName(value: String): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
      
      inline def setHonorificPrefix(value: String): Self = StObject.set(x, "honorificPrefix", value.asInstanceOf[js.Any])
      
      inline def setHonorificSuffix(value: String): Self = StObject.set(x, "honorificSuffix", value.asInstanceOf[js.Any])
      
      inline def setMiddleName(value: String): Self = StObject.set(x, "middleName", value.asInstanceOf[js.Any])
    }
  }
  
  trait Height extends StObject {
    
    var height: Double
    
    var url: String
    
    var width: Double
  }
  object Height {
    
    inline def apply(height: Double, url: String, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    extension [Self <: Height](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Label extends StObject {
    
    var label: String
    
    var `type`: String
    
    var value: String
  }
  object Label {
    
    inline def apply(label: String, `type`: String, value: String): Label = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Label]
    }
    
    extension [Self <: Label](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait LeftImageOffset extends StObject {
    
    var leftImageOffset: Double
    
    var topImageOffset: Double
  }
  object LeftImageOffset {
    
    inline def apply(leftImageOffset: Double, topImageOffset: Double): LeftImageOffset = {
      val __obj = js.Dynamic.literal(leftImageOffset = leftImageOffset.asInstanceOf[js.Any], topImageOffset = topImageOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[LeftImageOffset]
    }
    
    extension [Self <: LeftImageOffset](x: Self) {
      
      inline def setLeftImageOffset(value: Double): Self = StObject.set(x, "leftImageOffset", value.asInstanceOf[js.Any])
      
      inline def setTopImageOffset(value: Double): Self = StObject.set(x, "topImageOffset", value.asInstanceOf[js.Any])
    }
  }
  
  trait Max extends StObject {
    
    var max: Double
    
    var min: Double
  }
  object Max {
    
    inline def apply(max: Double, min: Double): Max = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[Max]
    }
    
    extension [Self <: Max](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    }
  }
  
  trait Primary extends StObject {
    
    var primary: Boolean
    
    var value: String
  }
  object Primary {
    
    inline def apply(primary: Boolean, value: String): Primary = {
      val __obj = js.Dynamic.literal(primary = primary.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Primary]
    }
    
    extension [Self <: Primary](x: Self) {
      
      inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    var `type`: String
    
    var value: String
  }
  object Type {
    
    inline def apply(`type`: String, value: String): Type = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Url extends StObject {
    
    var url: String
  }
  object Url {
    
    inline def apply(url: String): Url = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Url]
    }
    
    extension [Self <: Url](x: Self) {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
