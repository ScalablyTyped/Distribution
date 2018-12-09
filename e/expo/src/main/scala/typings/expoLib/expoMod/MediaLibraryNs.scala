package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "MediaLibrary")
@js.native
object MediaLibraryNs extends js.Object {
  /**
     * These fields apply only to albums whose type is moment
     */
  
  
  trait Album extends AlbumIos {
    var assetCount: scala.Double
    var id: java.lang.String
    var title: java.lang.String
  }
  
  /**
     * These fields can be obtained only by calling getAssetInfoAsync method
     */
  //#endregion
  // #region Album
  
  trait AlbumIos extends js.Object {
    // *
    var approximateLocation: js.UndefOr[expoLib.expoMod.LocationNs.LocationProps] = js.undefined
    // *
    var endTime: scala.Double
    // *
    var locationNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    // *
    var startTime: scala.Double
    var `type`: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait Asset
    extends AssetAndroid
       with AssetIos {
    var creationTime: scala.Double
    var duration: scala.Double
    // *
    var exif: js.UndefOr[js.Object] = js.undefined
    var filename: java.lang.String
    var height: scala.Double
    var id: java.lang.String
    // *
    var localUri: js.UndefOr[java.lang.String] = js.undefined
    // *
    var location: js.UndefOr[expoLib.expoMod.LocationNs.LocationProps] = js.undefined
    var mediaType: java.lang.String
    var modificationTime: scala.Double
    var uri: java.lang.String
    var width: scala.Double
  }
  
  // region Asset
  
  trait AssetAndroid extends js.Object {
    var albumId: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait AssetIos extends js.Object {
    // *
    var isFavorite: scala.Boolean
    var mediaSubtypes: js.UndefOr[js.Array[MediaType]] = js.undefined
    // *
    var orientation: scala.Double
  }
  
  // #endregion
  
  trait GetAssetsOptions extends js.Object {
    var after: js.UndefOr[java.lang.String] = js.undefined
    var album: js.UndefOr[java.lang.String | Album] = js.undefined
    var first: js.UndefOr[scala.Double] = js.undefined
    var mediaType: js.UndefOr[MediaType] = js.undefined
    var sortBy: js.UndefOr[SortBy] = js.undefined
  }
  
  
  trait GetAssetsResult extends js.Object {
    var assets: js.Array[Asset]
    var endCursor: java.lang.String
    var hasNextPage: scala.Boolean
    var totalCount: scala.Double
  }
  
  @js.native
  sealed trait MediaType extends js.Object
  
  @js.native
  sealed trait SortBy extends js.Object
  
  /**
     * Adds array of assets to the album.
     * On Android, by default it copies assets from the current album to provided one, however it's also possible to move them by passing false as copyAssets argument.
     * In case they're copied you should keep in mind that getAssetsAsync will return duplicated assets.
     */
  def addAssetsToAlbumAsync(assets: js.Array[Asset], album: Album): js.Promise[scala.Boolean] = js.native
  /**
     * Adds array of assets to the album.
     * On Android, by default it copies assets from the current album to provided one, however it's also possible to move them by passing false as copyAssets argument.
     * In case they're copied you should keep in mind that getAssetsAsync will return duplicated assets.
     */
  def addAssetsToAlbumAsync(assets: js.Array[Asset], album: Album, copyAssets: scala.Boolean): js.Promise[scala.Boolean] = js.native
  /**
     * Adds array of assets to the album.
     * On Android, by default it copies assets from the current album to provided one, however it's also possible to move them by passing false as copyAssets argument.
     * In case they're copied you should keep in mind that getAssetsAsync will return duplicated assets.
     */
  def addAssetsToAlbumAsync(assets: js.Array[Asset], album: java.lang.String): js.Promise[scala.Boolean] = js.native
  /**
     * Adds array of assets to the album.
     * On Android, by default it copies assets from the current album to provided one, however it's also possible to move them by passing false as copyAssets argument.
     * In case they're copied you should keep in mind that getAssetsAsync will return duplicated assets.
     */
  def addAssetsToAlbumAsync(assets: js.Array[Asset], album: java.lang.String, copyAssets: scala.Boolean): js.Promise[scala.Boolean] = js.native
  /**
     * Creates an album with given name and initial asset.
     * The asset parameter is required on Android, since it's not possible to create empty album on this platform.
     */
  def createAlbumAsync(albumName: java.lang.String, asset: Asset): js.Promise[Album] = js.native
  /**
     * Creates an album with given name and initial asset.
     * The asset parameter is required on Android, since it's not possible to create empty album on this platform.
     */
  def createAlbumAsync(albumName: java.lang.String, asset: java.lang.String): js.Promise[Album] = js.native
  /**
     * Creates an asset from existing file. The most common use case is to save a picture taken by Camera.
     */
  def createAssetAsync(localUri: java.lang.String): js.Promise[Asset] = js.native
  /**
     * Deletes assets from the library. On iOS it deletes assets from all albums they belong to, while on Android it keeps all copies of them
     * (album is strictly connected to the asset). Also, there is additional dialog on iOS that requires user to confirm this action.
     */
  def deleteAssetsAsync(asset: js.Array[Asset | java.lang.String]): js.Promise[scala.Boolean] = js.native
  /**
     * Queries for an album with a specific name.
     */
  def getAlbumAsync(albumName: java.lang.String): js.Promise[Album] = js.native
  /**
     * Queries for user-created albums in media gallery.
     */
  def getAlbumsAsync(): js.Promise[js.Array[Album]] = js.native
  /**
     * Provides more informations about an asset, including GPS location, local URI and EXIF metadata.
     */
  def getAssetInfoAsync(asset: Asset): js.Promise[Asset] = js.native
  /**
     * Provides more informations about an asset, including GPS location, local URI and EXIF metadata.
     */
  def getAssetInfoAsync(asset: java.lang.String): js.Promise[Asset] = js.native
  /**
     * Fetches a page of assets matching the provided criteria.
     */
  def getAssetsAsync(options: GetAssetsOptions): js.Promise[GetAssetsResult] = js.native
  /**
     * Available on iOS only. Fetches a list of moments, which is a group of assets taken around the same place and time.
     */
  def getMomentsAsync(): js.Promise[js.Array[Album]] = js.native
  /**
     * Removes given assets from album.
     * On Android, album will be automatically deleted if there are no more assets inside.
     */
  def removeAssetsFromAlbumAsync(assets: js.Array[Asset], album: Album): js.Promise[scala.Boolean] = js.native
  /**
     * Removes given assets from album.
     * On Android, album will be automatically deleted if there are no more assets inside.
     */
  def removeAssetsFromAlbumAsync(assets: js.Array[Asset], album: java.lang.String): js.Promise[scala.Boolean] = js.native
  @js.native
  object MediaType extends js.Object {
    @js.native
    sealed trait audio
      extends expoLib.expoMod.MediaLibraryNs.MediaType
    
    @js.native
    sealed trait photo
      extends expoLib.expoMod.MediaLibraryNs.MediaType
    
    @js.native
    sealed trait unknow
      extends expoLib.expoMod.MediaLibraryNs.MediaType
    
    @js.native
    sealed trait video
      extends expoLib.expoMod.MediaLibraryNs.MediaType
    
    /* "audio" */ val audio: audio with java.lang.String = js.native
    /* "photo" */ val photo: photo with java.lang.String = js.native
    /* "unknow" */ val unknow: unknow with java.lang.String = js.native
    /* "video" */ val video: video with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[expoLib.expoMod.MediaLibraryNs.MediaType with java.lang.String] = js.native
  }
  
  @js.native
  object SortBy extends js.Object {
    @js.native
    sealed trait creationTime
      extends expoLib.expoMod.MediaLibraryNs.SortBy
    
    @js.native
    sealed trait default
      extends expoLib.expoMod.MediaLibraryNs.SortBy
    
    @js.native
    sealed trait duration
      extends expoLib.expoMod.MediaLibraryNs.SortBy
    
    @js.native
    sealed trait height
      extends expoLib.expoMod.MediaLibraryNs.SortBy
    
    @js.native
    sealed trait id
      extends expoLib.expoMod.MediaLibraryNs.SortBy
    
    @js.native
    sealed trait mediaType
      extends expoLib.expoMod.MediaLibraryNs.SortBy
    
    @js.native
    sealed trait modificationTime
      extends expoLib.expoMod.MediaLibraryNs.SortBy
    
    @js.native
    sealed trait width
      extends expoLib.expoMod.MediaLibraryNs.SortBy
    
    /* "creationTime" */ val creationTime: creationTime with java.lang.String = js.native
    /* "default" */ val default: default with java.lang.String = js.native
    /* "duration" */ val duration: duration with java.lang.String = js.native
    /* "height" */ val height: height with java.lang.String = js.native
    /* "id" */ val id: id with java.lang.String = js.native
    /* "mediaType" */ val mediaType: mediaType with java.lang.String = js.native
    /* "modificationTime" */ val modificationTime: modificationTime with java.lang.String = js.native
    /* "width" */ val width: width with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[expoLib.expoMod.MediaLibraryNs.SortBy with java.lang.String] = js.native
  }
  
}

