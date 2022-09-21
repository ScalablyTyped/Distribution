package typings.fireo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Field {
  
  @JSImport("fireo", "Field")
  @js.native
  val ^ : js.Any = js.native
  
  inline def Boolean(): BooleanField = ^.asInstanceOf[js.Dynamic].applyDynamic("Boolean")().asInstanceOf[BooleanField]
  inline def Boolean(options: BaseFieldOptions): BooleanField = ^.asInstanceOf[js.Dynamic].applyDynamic("Boolean")(options.asInstanceOf[js.Any]).asInstanceOf[BooleanField]
  
  inline def DateTime(): DateTimeField = ^.asInstanceOf[js.Dynamic].applyDynamic("DateTime")().asInstanceOf[DateTimeField]
  inline def DateTime(options: DateTimeFieldOptions): DateTimeField = ^.asInstanceOf[js.Dynamic].applyDynamic("DateTime")(options.asInstanceOf[js.Any]).asInstanceOf[DateTimeField]
  
  inline def GeoPoint(): GeoPointField = ^.asInstanceOf[js.Dynamic].applyDynamic("GeoPoint")().asInstanceOf[GeoPointField]
  inline def GeoPoint(options: BaseFieldOptions): GeoPointField = ^.asInstanceOf[js.Dynamic].applyDynamic("GeoPoint")(options.asInstanceOf[js.Any]).asInstanceOf[GeoPointField]
  
  inline def ID(): IDField = ^.asInstanceOf[js.Dynamic].applyDynamic("ID")().asInstanceOf[IDField]
  
  inline def List(): ListField = ^.asInstanceOf[js.Dynamic].applyDynamic("List")().asInstanceOf[ListField]
  inline def List(options: BaseFieldOptions): ListField = ^.asInstanceOf[js.Dynamic].applyDynamic("List")(options.asInstanceOf[js.Any]).asInstanceOf[ListField]
  
  inline def Map(): MapField = ^.asInstanceOf[js.Dynamic].applyDynamic("Map")().asInstanceOf[MapField]
  inline def Map(options: BaseFieldOptions): MapField = ^.asInstanceOf[js.Dynamic].applyDynamic("Map")(options.asInstanceOf[js.Any]).asInstanceOf[MapField]
  
  inline def Number(): NumberField = ^.asInstanceOf[js.Dynamic].applyDynamic("Number")().asInstanceOf[NumberField]
  inline def Number(options: BaseFieldOptions): NumberField = ^.asInstanceOf[js.Dynamic].applyDynamic("Number")(options.asInstanceOf[js.Any]).asInstanceOf[NumberField]
  
  inline def Reference(): ReferenceField = ^.asInstanceOf[js.Dynamic].applyDynamic("Reference")().asInstanceOf[ReferenceField]
  inline def Reference(options: ReferenceFieldOptions): ReferenceField = ^.asInstanceOf[js.Dynamic].applyDynamic("Reference")(options.asInstanceOf[js.Any]).asInstanceOf[ReferenceField]
  
  inline def Text(): TextField = ^.asInstanceOf[js.Dynamic].applyDynamic("Text")().asInstanceOf[TextField]
  inline def Text(options: TextFieldOptions): TextField = ^.asInstanceOf[js.Dynamic].applyDynamic("Text")(options.asInstanceOf[js.Any]).asInstanceOf[TextField]
}
