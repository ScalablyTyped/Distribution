package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Game extends StObject {
  
  /** ID of the active data */
  var activeDataId: js.UndefOr[Double] = js.undefined
  
  /** Whether the data is present on disk */
  var activeDataOnDisk: Boolean
  
  /** All attached Additional Apps of a game */
  var addApps: js.Array[AdditionalApp]
  
  /** Any alternate titles to match against search */
  var alternateTitles: String
  
  /** Path to the application that runs the game */
  var applicationPath: String
  
  /** If the game is "broken" or not */
  var broken: Boolean
  
  var data: js.UndefOr[js.Array[GameData_]] = js.undefined
  
  /** Date-time of when the game was added to collection */
  var dateAdded: String
  
  /** Date-time of when the game was added to collection */
  var dateModified: String
  
  /** Name of the developer(s) of the game (developer names are separated by ',') */
  var developer: String
  
  /** Game is not suitable for children */
  var extreme: Boolean
  
  /** ID of the game (unique identifier) */
  var id: String
  
  /** The language(s) the game is in */
  var language: String
  
  /** Command line argument(s) passed to the application to launch the game */
  var launchCommand: String
  
  /** Library this game belongs to */
  var library: String
  
  /** Information that could be useful for the player (of varying importance) */
  var notes: String
  
  /** Unused */
  var orderTitle: String
  
  /** Original description of the game (probably given by the game's creator or publisher) */
  var originalDescription: String
  
  /** ID of the game which owns this game */
  var parentGameId: js.UndefOr[String] = js.undefined
  
  /** If the game is a placeholder (and can therefore not be saved) */
  var placeholder: Boolean
  
  /** Platform the game runs on (Flash, HTML5, Shockwave etc.) */
  var platform: String
  
  /** If the game is single player or multiplayer, and if the multiplayer is cooperative or not */
  var playMode: String
  
  /** Name of the publisher of the game */
  var publisher: String
  
  /** Date of when the game was released */
  var releaseDate: String
  
  /** Game series the game belongs to (empty string if none) */
  var series: String
  
  /** Source if the game files, either full URL or the name of the website */
  var source: String
  
  /** How playable the game is */
  var status: String
  
  /** List of tags attached to the game */
  var tags: js.Array[Tag]
  
  /** List of tags attached to the game in a string format */
  var tagsStr: String
  
  /** Full title of the game */
  var title: String
  
  def updateTagsStr(): Unit
  
  /** Version of the game */
  var version: String
}
object Game {
  
  inline def apply(
    activeDataOnDisk: Boolean,
    addApps: js.Array[AdditionalApp],
    alternateTitles: String,
    applicationPath: String,
    broken: Boolean,
    dateAdded: String,
    dateModified: String,
    developer: String,
    extreme: Boolean,
    id: String,
    language: String,
    launchCommand: String,
    library: String,
    notes: String,
    orderTitle: String,
    originalDescription: String,
    placeholder: Boolean,
    platform: String,
    playMode: String,
    publisher: String,
    releaseDate: String,
    series: String,
    source: String,
    status: String,
    tags: js.Array[Tag],
    tagsStr: String,
    title: String,
    updateTagsStr: () => Unit,
    version: String
  ): Game = {
    val __obj = js.Dynamic.literal(activeDataOnDisk = activeDataOnDisk.asInstanceOf[js.Any], addApps = addApps.asInstanceOf[js.Any], alternateTitles = alternateTitles.asInstanceOf[js.Any], applicationPath = applicationPath.asInstanceOf[js.Any], broken = broken.asInstanceOf[js.Any], dateAdded = dateAdded.asInstanceOf[js.Any], dateModified = dateModified.asInstanceOf[js.Any], developer = developer.asInstanceOf[js.Any], extreme = extreme.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], launchCommand = launchCommand.asInstanceOf[js.Any], library = library.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], orderTitle = orderTitle.asInstanceOf[js.Any], originalDescription = originalDescription.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], playMode = playMode.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], releaseDate = releaseDate.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], tagsStr = tagsStr.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updateTagsStr = js.Any.fromFunction0(updateTagsStr), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Game]
  }
  
  extension [Self <: Game](x: Self) {
    
    inline def setActiveDataId(value: Double): Self = StObject.set(x, "activeDataId", value.asInstanceOf[js.Any])
    
    inline def setActiveDataIdUndefined: Self = StObject.set(x, "activeDataId", js.undefined)
    
    inline def setActiveDataOnDisk(value: Boolean): Self = StObject.set(x, "activeDataOnDisk", value.asInstanceOf[js.Any])
    
    inline def setAddApps(value: js.Array[AdditionalApp]): Self = StObject.set(x, "addApps", value.asInstanceOf[js.Any])
    
    inline def setAddAppsVarargs(value: AdditionalApp*): Self = StObject.set(x, "addApps", js.Array(value*))
    
    inline def setAlternateTitles(value: String): Self = StObject.set(x, "alternateTitles", value.asInstanceOf[js.Any])
    
    inline def setApplicationPath(value: String): Self = StObject.set(x, "applicationPath", value.asInstanceOf[js.Any])
    
    inline def setBroken(value: Boolean): Self = StObject.set(x, "broken", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Array[GameData_]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: GameData_ *): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setDateAdded(value: String): Self = StObject.set(x, "dateAdded", value.asInstanceOf[js.Any])
    
    inline def setDateModified(value: String): Self = StObject.set(x, "dateModified", value.asInstanceOf[js.Any])
    
    inline def setDeveloper(value: String): Self = StObject.set(x, "developer", value.asInstanceOf[js.Any])
    
    inline def setExtreme(value: Boolean): Self = StObject.set(x, "extreme", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLaunchCommand(value: String): Self = StObject.set(x, "launchCommand", value.asInstanceOf[js.Any])
    
    inline def setLibrary(value: String): Self = StObject.set(x, "library", value.asInstanceOf[js.Any])
    
    inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setOrderTitle(value: String): Self = StObject.set(x, "orderTitle", value.asInstanceOf[js.Any])
    
    inline def setOriginalDescription(value: String): Self = StObject.set(x, "originalDescription", value.asInstanceOf[js.Any])
    
    inline def setParentGameId(value: String): Self = StObject.set(x, "parentGameId", value.asInstanceOf[js.Any])
    
    inline def setParentGameIdUndefined: Self = StObject.set(x, "parentGameId", js.undefined)
    
    inline def setPlaceholder(value: Boolean): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlayMode(value: String): Self = StObject.set(x, "playMode", value.asInstanceOf[js.Any])
    
    inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setReleaseDate(value: String): Self = StObject.set(x, "releaseDate", value.asInstanceOf[js.Any])
    
    inline def setSeries(value: String): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsStr(value: String): Self = StObject.set(x, "tagsStr", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setUpdateTagsStr(value: () => Unit): Self = StObject.set(x, "updateTagsStr", js.Any.fromFunction0(value))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
