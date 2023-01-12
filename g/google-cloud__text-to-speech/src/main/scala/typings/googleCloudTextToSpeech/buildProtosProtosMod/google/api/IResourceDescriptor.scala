package typings.googleCloudTextToSpeech.buildProtosProtosMod.google.api

import typings.googleCloudTextToSpeech.buildProtosProtosMod.google.api.ResourceDescriptor.Style
import typings.std.History
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ResourceDescriptor. */
trait IResourceDescriptor extends StObject {
  
  /** ResourceDescriptor history */
  var history: js.UndefOr[
    History | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.api.ResourceDescriptor.History * / any */ String) | Null
  ] = js.undefined
  
  /** ResourceDescriptor nameField */
  var nameField: js.UndefOr[String | Null] = js.undefined
  
  /** ResourceDescriptor pattern */
  var pattern: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** ResourceDescriptor plural */
  var plural: js.UndefOr[String | Null] = js.undefined
  
  /** ResourceDescriptor singular */
  var singular: js.UndefOr[String | Null] = js.undefined
  
  /** ResourceDescriptor style */
  var style: js.UndefOr[js.Array[Style] | Null] = js.undefined
  
  /** ResourceDescriptor type */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object IResourceDescriptor {
  
  inline def apply(): IResourceDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IResourceDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IResourceDescriptor] (val x: Self) extends AnyVal {
    
    inline def setHistory(
      value: History | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.api.ResourceDescriptor.History * / any */ String)
    ): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setHistoryNull: Self = StObject.set(x, "history", null)
    
    inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    inline def setNameField(value: String): Self = StObject.set(x, "nameField", value.asInstanceOf[js.Any])
    
    inline def setNameFieldNull: Self = StObject.set(x, "nameField", null)
    
    inline def setNameFieldUndefined: Self = StObject.set(x, "nameField", js.undefined)
    
    inline def setPattern(value: js.Array[String]): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternNull: Self = StObject.set(x, "pattern", null)
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setPatternVarargs(value: String*): Self = StObject.set(x, "pattern", js.Array(value*))
    
    inline def setPlural(value: String): Self = StObject.set(x, "plural", value.asInstanceOf[js.Any])
    
    inline def setPluralNull: Self = StObject.set(x, "plural", null)
    
    inline def setPluralUndefined: Self = StObject.set(x, "plural", js.undefined)
    
    inline def setSingular(value: String): Self = StObject.set(x, "singular", value.asInstanceOf[js.Any])
    
    inline def setSingularNull: Self = StObject.set(x, "singular", null)
    
    inline def setSingularUndefined: Self = StObject.set(x, "singular", js.undefined)
    
    inline def setStyle(value: js.Array[Style]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setStyleVarargs(value: Style*): Self = StObject.set(x, "style", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
