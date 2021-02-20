package typings.gapiPlus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait CoverInfo extends StObject {
    
    var coverInfo: LeftImageOffset = js.native
    
    var coverPhoto: Height = js.native
    
    var layout: String = js.native
  }
  object CoverInfo {
    
    @scala.inline
    def apply(coverInfo: LeftImageOffset, coverPhoto: Height, layout: String): CoverInfo = {
      val __obj = js.Dynamic.literal(coverInfo = coverInfo.asInstanceOf[js.Any], coverPhoto = coverPhoto.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
      __obj.asInstanceOf[CoverInfo]
    }
    
    @scala.inline
    implicit class CoverInfoMutableBuilder[Self <: CoverInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoverInfo(value: LeftImageOffset): Self = StObject.set(x, "coverInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoverPhoto(value: Height): Self = StObject.set(x, "coverPhoto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Department extends StObject {
    
    var department: String = js.native
    
    var description: String = js.native
    
    var endDate: String = js.native
    
    var location: String = js.native
    
    var name: String = js.native
    
    var primary: Boolean = js.native
    
    var startDate: String = js.native
    
    var title: String = js.native
    
    var `type`: String = js.native
  }
  object Department {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class DepartmentMutableBuilder[Self <: Department] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDepartment(value: String): Self = StObject.set(x, "department", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FamilyName extends StObject {
    
    var familyName: String = js.native
    
    var formatted: String = js.native
    
    var givenName: String = js.native
    
    var honorificPrefix: String = js.native
    
    var honorificSuffix: String = js.native
    
    var middleName: String = js.native
  }
  object FamilyName {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class FamilyNameMutableBuilder[Self <: FamilyName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatted(value: String): Self = StObject.set(x, "formatted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGivenName(value: String): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHonorificPrefix(value: String): Self = StObject.set(x, "honorificPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHonorificSuffix(value: String): Self = StObject.set(x, "honorificSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiddleName(value: String): Self = StObject.set(x, "middleName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Height extends StObject {
    
    var height: Double = js.native
    
    var url: String = js.native
    
    var width: Double = js.native
  }
  object Height {
    
    @scala.inline
    def apply(height: Double, url: String, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Label extends StObject {
    
    var label: String = js.native
    
    var `type`: String = js.native
    
    var value: String = js.native
  }
  object Label {
    
    @scala.inline
    def apply(label: String, `type`: String, value: String): Label = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Label]
    }
    
    @scala.inline
    implicit class LabelMutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LeftImageOffset extends StObject {
    
    var leftImageOffset: Double = js.native
    
    var topImageOffset: Double = js.native
  }
  object LeftImageOffset {
    
    @scala.inline
    def apply(leftImageOffset: Double, topImageOffset: Double): LeftImageOffset = {
      val __obj = js.Dynamic.literal(leftImageOffset = leftImageOffset.asInstanceOf[js.Any], topImageOffset = topImageOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[LeftImageOffset]
    }
    
    @scala.inline
    implicit class LeftImageOffsetMutableBuilder[Self <: LeftImageOffset] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeftImageOffset(value: Double): Self = StObject.set(x, "leftImageOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopImageOffset(value: Double): Self = StObject.set(x, "topImageOffset", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Max extends StObject {
    
    var max: Double = js.native
    
    var min: Double = js.native
  }
  object Max {
    
    @scala.inline
    def apply(max: Double, min: Double): Max = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[Max]
    }
    
    @scala.inline
    implicit class MaxMutableBuilder[Self <: Max] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Primary extends StObject {
    
    var primary: Boolean = js.native
    
    var value: String = js.native
  }
  object Primary {
    
    @scala.inline
    def apply(primary: Boolean, value: String): Primary = {
      val __obj = js.Dynamic.literal(primary = primary.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Primary]
    }
    
    @scala.inline
    implicit class PrimaryMutableBuilder[Self <: Primary] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Type extends StObject {
    
    var `type`: String = js.native
    
    var value: String = js.native
  }
  object Type {
    
    @scala.inline
    def apply(`type`: String, value: String): Type = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Url extends StObject {
    
    var url: String = js.native
  }
  object Url {
    
    @scala.inline
    def apply(url: String): Url = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Url]
    }
    
    @scala.inline
    implicit class UrlMutableBuilder[Self <: Url] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
