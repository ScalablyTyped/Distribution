package typings.flashpointLauncher.mod

import typings.flashpointLauncher.anon.NewGame
import typings.flashpointLauncher.anon.NewPlaylist
import typings.flashpointLauncher.anon.OldGame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Collection of Game related API functions */
object games {
  
  @JSImport("flashpoint-launcher", "games")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Adds a Game to a Playlist
    * @param playlistId Playlist to add the Game to
    * @param gameId ID of the Game to add
    */
  inline def addPlaylistGame(playlistId: String, gameId: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("addPlaylistGame")(playlistId.asInstanceOf[js.Any], gameId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  // Games
  /** Returns the total number of games in the database */
  inline def countGames(): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("countGames")().asInstanceOf[js.Promise[Double]]
  
  /**
    * Parses a Playlist JSON file and returns an object you can save later.
    * @param jsonData Raw JSON data of the Playlist file
    * @param library Library to use instead of Playlist defined library
    */
  inline def createPlaylistFromJson(jsonData: Any): Playlist = ^.asInstanceOf[js.Dynamic].applyDynamic("createPlaylistFromJson")(jsonData.asInstanceOf[js.Any]).asInstanceOf[Playlist]
  inline def createPlaylistFromJson(jsonData: Any, library: String): Playlist = (^.asInstanceOf[js.Dynamic].applyDynamic("createPlaylistFromJson")(jsonData.asInstanceOf[js.Any], library.asInstanceOf[js.Any])).asInstanceOf[Playlist]
  
  /**
    * Finds a Game given its ID
    * @param id ID of the Game
    */
  inline def findGame(id: String): js.Promise[js.UndefOr[Game]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findGame")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[Game]]]
  
  /**
    * Finds a selection of Games given filter options
    * @param opts Filter options
    * @param shallow Whether to return ViewGame or Game objects
    */
  inline def findGames[T /* <: Boolean */](opts: FindGamesOpts, shallow: T): js.Promise[js.Array[ResponseGameRange[T]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findGames")(opts.asInstanceOf[js.Any], shallow.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[ResponseGameRange[T]]]]
  
  /**
    * Finds all Games using a Tag
    * @param tag Tag to filter for
    */
  inline def findGamesWithTag(tag: Tag): js.Promise[js.Array[Game]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findGamesWithTag")(tag.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Game]]]
  
  // Misc
  /**
    * Returns all unique Platform strings in a library
    * @param library Library to search
    */
  inline def findPlatforms(library: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findPlatforms")(library.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  
  // Playlist
  /**
    * Finds a playlist given its ID
    * @param playlistId ID of the Playlist
    * @param join Whether to include Playlist Games in the result
    */
  inline def findPlaylist(playlistId: String): js.Promise[js.UndefOr[Playlist]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findPlaylist")(playlistId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[Playlist]]]
  inline def findPlaylist(playlistId: String, join: Boolean): js.Promise[js.UndefOr[Playlist]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findPlaylist")(playlistId.asInstanceOf[js.Any], join.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Playlist]]]
  
  /**
    * Finds a playlist given its name
    * @param playlistName Name of the Playlist
    * @param join Whether to include Playlist Games in the result
    */
  inline def findPlaylistByName(playlistName: String): js.Promise[js.UndefOr[Playlist]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findPlaylistByName")(playlistName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[Playlist]]]
  inline def findPlaylistByName(playlistName: String, join: Boolean): js.Promise[js.UndefOr[Playlist]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findPlaylistByName")(playlistName.asInstanceOf[js.Any], join.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Playlist]]]
  
  // Playlist Game
  /**
    * Finds a Playlist Game entry in a Playlist
    * @param playlistId Playlist to search
    * @param gameId Game to find
    */
  inline def findPlaylistGame(playlistId: String, gameId: String): js.Promise[js.UndefOr[PlaylistGame]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findPlaylistGame")(playlistId.asInstanceOf[js.Any], gameId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[PlaylistGame]]]
  
  /** Find all Playlists in the database (Playlist Games not returned) */
  inline def findPlaylists(showExtreme: Boolean): js.Promise[js.Array[Playlist]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findPlaylists")(showExtreme.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Playlist]]]
  
  /**
    * Returns whether a game is extreme based on its tags.
    * @param game Game to check
    */
  inline def isGameExtreme(game: Game): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGameExtreme")(game.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("flashpoint-launcher", "games.onDidInstallGameData")
  @js.native
  val onDidInstallGameData: Event[GameData_] = js.native
  
  @JSImport("flashpoint-launcher", "games.onDidLaunchAddApp")
  @js.native
  val onDidLaunchAddApp: Event[AdditionalApp] = js.native
  
  @JSImport("flashpoint-launcher", "games.onDidLaunchCurationAddApp")
  @js.native
  val onDidLaunchCurationAddApp: Event[AdditionalApp] = js.native
  
  @JSImport("flashpoint-launcher", "games.onDidLaunchCurationGame")
  @js.native
  val onDidLaunchCurationGame: Event[Game] = js.native
  
  @JSImport("flashpoint-launcher", "games.onDidLaunchGame")
  @js.native
  val onDidLaunchGame: Event[Game] = js.native
  
  @JSImport("flashpoint-launcher", "games.onDidRemoveGame")
  @js.native
  val onDidRemoveGame: Event[Game] = js.native
  
  @JSImport("flashpoint-launcher", "games.onDidRemovePlaylistGame")
  @js.native
  val onDidRemovePlaylistGame: Event[PlaylistGame] = js.native
  
  @JSImport("flashpoint-launcher", "games.onDidUninstallGameData")
  @js.native
  val onDidUninstallGameData: Event[GameData_] = js.native
  
  @JSImport("flashpoint-launcher", "games.onDidUpdateGame")
  @js.native
  val onDidUpdateGame: Event[NewGame] = js.native
  
  @JSImport("flashpoint-launcher", "games.onDidUpdatePlaylist")
  @js.native
  val onDidUpdatePlaylist: Event[NewPlaylist] = js.native
  
  @JSImport("flashpoint-launcher", "games.onDidUpdatePlaylistGame")
  @js.native
  val onDidUpdatePlaylistGame: Event[OldGame] = js.native
  
  @JSImport("flashpoint-launcher", "games.onWillImportGame")
  @js.native
  val onWillImportGame: Event[CurationImportState] = js.native
  
  @JSImport("flashpoint-launcher", "games.onWillLaunchAddApp")
  @js.native
  val onWillLaunchAddApp: Event[AdditionalApp] = js.native
  
  @JSImport("flashpoint-launcher", "games.onWillLaunchCurationAddApp")
  @js.native
  val onWillLaunchCurationAddApp: Event[AdditionalApp] = js.native
  
  @JSImport("flashpoint-launcher", "games.onWillLaunchCurationGame")
  @js.native
  val onWillLaunchCurationGame: Event[GameLaunchInfo] = js.native
  
  // Events
  @JSImport("flashpoint-launcher", "games.onWillLaunchGame")
  @js.native
  val onWillLaunchGame: Event[GameLaunchInfo] = js.native
  
  @JSImport("flashpoint-launcher", "games.onWillUninstallGameData")
  @js.native
  val onWillUninstallGameData: Event[GameData_] = js.native
  
  /**
    * Removes a Game and all its AddApps
    * @param gameId ID of Game to remove
    */
  inline def removeGameAndAddApps(gameId: String): js.Promise[js.UndefOr[Game]] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeGameAndAddApps")(gameId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[Game]]]
  
  /**
    * Removes a playlist
    * @param playlist Playlist ID to remove
    * @returns Playlist that was removed
    */
  inline def removePlaylist(playlistId: String): js.Promise[js.UndefOr[Playlist]] = ^.asInstanceOf[js.Dynamic].applyDynamic("removePlaylist")(playlistId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[Playlist]]]
  
  /**
    * Removes a Playlist Game entry from a Playlist
    * @param playlistId Playlist to search
    * @param gameId Game to remove
    */
  inline def removePlaylistGame(playlistId: String, gameId: String): js.Promise[js.UndefOr[PlaylistGame]] = (^.asInstanceOf[js.Dynamic].applyDynamic("removePlaylistGame")(playlistId.asInstanceOf[js.Any], gameId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[PlaylistGame]]]
  
  /**
    * Updates / Creates a Game
    * @param game Game data to save
    */
  inline def updateGame(game: Game): js.Promise[Game] = ^.asInstanceOf[js.Dynamic].applyDynamic("updateGame")(game.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Game]]
  
  /**
    * Updates / Creates many Games in a transaction
    * @param games Game data to save
    */
  inline def updateGames(games: js.Array[Game]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("updateGames")(games.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Updates / Creates a Playlist
    * @param playlist Playlist data to save
    */
  inline def updatePlaylist(playlist: Playlist): js.Promise[Playlist] = ^.asInstanceOf[js.Dynamic].applyDynamic("updatePlaylist")(playlist.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Playlist]]
  
  /**
    * Update / Create a Playlist Game entry
    * @param playlistGame Playlist Game entry to save
    */
  inline def updatePlaylistGame(playlistGame: PlaylistGame): js.Promise[PlaylistGame] = ^.asInstanceOf[js.Dynamic].applyDynamic("updatePlaylistGame")(playlistGame.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PlaylistGame]]
  
  /**
    * Update / Create many Playlist Game entries in a transaction
    * @param playlistGames Playlist Game entries to save
    */
  inline def updatePlaylistGames(playlistGames: js.Array[PlaylistGame]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("updatePlaylistGames")(playlistGames.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
