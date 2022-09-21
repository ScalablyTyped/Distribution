package typings.flashpointLauncher.mod

import typings.flashpointLauncher.flashpointLauncherStrings.createDirectory
import typings.flashpointLauncher.flashpointLauncherStrings.dontAddToRecent
import typings.flashpointLauncher.flashpointLauncherStrings.multiSelections
import typings.flashpointLauncher.flashpointLauncherStrings.noResolveAliases
import typings.flashpointLauncher.flashpointLauncherStrings.openDirectory
import typings.flashpointLauncher.flashpointLauncherStrings.openFile
import typings.flashpointLauncher.flashpointLauncherStrings.promptToCreate
import typings.flashpointLauncher.flashpointLauncherStrings.showHiddenFiles
import typings.flashpointLauncher.flashpointLauncherStrings.treatPackageAsDirectory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** See Electron docs for explanations. https://www.electronjs.org/docs/api/dialog */
trait ShowOpenDialogOptions extends StObject {
  
  var buttonLabel: js.UndefOr[String] = js.undefined
  
  var defaultPath: js.UndefOr[String] = js.undefined
  
  var filters: js.Array[FileFilter]
  
  var message: js.UndefOr[String] = js.undefined
  
  var properties: js.UndefOr[
    js.Array[
      openFile | openDirectory | multiSelections | showHiddenFiles | createDirectory | promptToCreate | noResolveAliases | treatPackageAsDirectory | dontAddToRecent
    ]
  ] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object ShowOpenDialogOptions {
  
  inline def apply(filters: js.Array[FileFilter]): ShowOpenDialogOptions = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowOpenDialogOptions]
  }
  
  extension [Self <: ShowOpenDialogOptions](x: Self) {
    
    inline def setButtonLabel(value: String): Self = StObject.set(x, "buttonLabel", value.asInstanceOf[js.Any])
    
    inline def setButtonLabelUndefined: Self = StObject.set(x, "buttonLabel", js.undefined)
    
    inline def setDefaultPath(value: String): Self = StObject.set(x, "defaultPath", value.asInstanceOf[js.Any])
    
    inline def setDefaultPathUndefined: Self = StObject.set(x, "defaultPath", js.undefined)
    
    inline def setFilters(value: js.Array[FileFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersVarargs(value: FileFilter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setProperties(
      value: js.Array[
          openFile | openDirectory | multiSelections | showHiddenFiles | createDirectory | promptToCreate | noResolveAliases | treatPackageAsDirectory | dontAddToRecent
        ]
    ): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(
      value: (openFile | openDirectory | multiSelections | showHiddenFiles | createDirectory | promptToCreate | noResolveAliases | treatPackageAsDirectory | dontAddToRecent)*
    ): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
