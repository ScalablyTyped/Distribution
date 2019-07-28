package typings.expo.expoMod

import typings.expo.expoMod.LocationNs.LocationProps
import typings.expo.expoMod.MediaLibraryNs.Album
import typings.expo.expoMod.MediaLibraryNs.AlbumIos
import typings.expo.expoMod.MediaLibraryNs.AssetAndroid
import typings.expo.expoMod.MediaLibraryNs.AssetIos
import typings.expo.expoMod.MediaLibraryNs.GetAssetsOptions
import typings.expo.expoMod.MediaLibraryNs.GetAssetsResult
import typings.expo.expoMod.MediaLibraryNs.MediaType
import typings.expo.expoMod.MediaLibraryNs.SortBy
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
    var assetCount: Double
    var id: String
    var title: String
  }
  
  /**
    * These fields can be obtained only by calling getAssetInfoAsync method
    */
  //#endregion
  // #region Album
  trait AlbumIos extends js.Object {
    // *
    var approximateLocation: js.UndefOr[LocationProps] = js.undefined
    // *
    var endTime: Double
    // *
    var locationNames: js.UndefOr[js.Array[String]] = js.undefined
    // *
    var startTime: Double
    var `type`: js.UndefOr[String] = js.undefined
  }
  
  trait Asset
    extends AssetAndroid
       with AssetIos {
    var creationTime: Double
    var duration: Double
    // *
    var exif: js.UndefOr[js.Object] = js.undefined
    var filename: String
    var height: Double
    var id: String
    // *
    var localUri: js.UndefOr[String] = js.undefined
    // *
    var location: js.UndefOr[LocationProps] = js.undefined
    var mediaType: String
    var modificationTime: Double
    var uri: String
    var width: Double
  }
  
  // region Asset
  trait AssetAndroid extends js.Object {
    var albumId: js.UndefOr[String] = js.undefined
  }
  
  trait AssetIos extends js.Object {
    // *
    var isFavorite: Boolean
    var mediaSubtypes: js.UndefOr[js.Array[MediaType]] = js.undefined
    // *
    var orientation: Double
  }
  
  // #endregion
  trait GetAssetsOptions extends js.Object {
    var after: js.UndefOr[String] = js.undefined
    var album: js.UndefOr[String | Album] = js.undefined
    var first: js.UndefOr[Double] = js.undefined
    var mediaType: js.UndefOr[MediaType] = js.undefined
    var sortBy: js.UndefOr[SortBy] = js.undefined
  }
  
  trait GetAssetsResult extends js.Object {
    var assets: js.Array[typings.expo.expoMod.MediaLibraryNs.Asset]
    var endCursor: String
    var hasNextPage: Boolean
    var totalCount: Double
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
  def addAssetsToAlbumAsync(assets: js.Array[typings.expo.expoMod.MediaLibraryNs.Asset], album: String): js.Promise[Boolean] = js.native
  def addAssetsToAlbumAsync(assets: js.Array[typings.expo.expoMod.MediaLibraryNs.Asset], album: String, copyAssets: Boolean): js.Promise[Boolean] = js.native
  def addAssetsToAlbumAsync(assets: js.Array[typings.expo.expoMod.MediaLibraryNs.Asset], album: Album): js.Promise[Boolean] = js.native
  def addAssetsToAlbumAsync(assets: js.Array[typings.expo.expoMod.MediaLibraryNs.Asset], album: Album, copyAssets: Boolean): js.Promise[Boolean] = js.native
  /**
    * Creates an album with given name and initial asset.
    * The asset parameter is required on Android, since it's not possible to create empty album on this platform.
    */
  def createAlbumAsync(albumName: String, asset: String): js.Promise[Album] = js.native
  def createAlbumAsync(albumName: String, asset: typings.expo.expoMod.MediaLibraryNs.Asset): js.Promise[Album] = js.native
  /**
    * Creates an asset from existing file. The most common use case is to save a picture taken by Camera.
    */
  def createAssetAsync(localUri: String): js.Promise[typings.expo.expoMod.MediaLibraryNs.Asset] = js.native
  /**
    * Deletes assets from the library. On iOS it deletes assets from all albums they belong to, while on Android it keeps all copies of them
    * (album is strictly connected to the asset). Also, there is additional dialog on iOS that requires user to confirm this action.
    */
  def deleteAssetsAsync(asset: js.Array[typings.expo.expoMod.MediaLibraryNs.Asset | String]): js.Promise[Boolean] = js.native
  /**
    * Queries for an album with a specific name.
    */
  def getAlbumAsync(albumName: String): js.Promise[Album] = js.native
  /**
    * Queries for user-created albums in media gallery.
    */
  def getAlbumsAsync(): js.Promise[js.Array[Album]] = js.native
  /**
    * Provides more informations about an asset, including GPS location, local URI and EXIF metadata.
    */
  def getAssetInfoAsync(asset: String): js.Promise[typings.expo.expoMod.MediaLibraryNs.Asset] = js.native
  def getAssetInfoAsync(asset: typings.expo.expoMod.MediaLibraryNs.Asset): js.Promise[typings.expo.expoMod.MediaLibraryNs.Asset] = js.native
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
  def removeAssetsFromAlbumAsync(assets: js.Array[typings.expo.expoMod.MediaLibraryNs.Asset], album: String): js.Promise[Boolean] = js.native
  def removeAssetsFromAlbumAsync(assets: js.Array[typings.expo.expoMod.MediaLibraryNs.Asset], album: Album): js.Promise[Boolean] = js.native
  @js.native
  object MediaType extends js.Object {
    @js.native
    sealed trait audio extends MediaType
    
    @js.native
    sealed trait photo extends MediaType
    
    @js.native
    sealed trait unknow extends MediaType
    
    @js.native
    sealed trait video extends MediaType
    
    /* "audio" */ val audio: typings.expo.expoMod.MediaLibraryNs.MediaType.audio with String = js.native
    /* "photo" */ val photo: typings.expo.expoMod.MediaLibraryNs.MediaType.photo with String = js.native
    /* "unknow" */ val unknow: typings.expo.expoMod.MediaLibraryNs.MediaType.unknow with String = js.native
    /* "video" */ val video: typings.expo.expoMod.MediaLibraryNs.MediaType.video with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MediaType with String] = js.native
  }
  
  @js.native
  object SortBy extends js.Object {
    @js.native
    sealed trait creationTime extends SortBy
    
    @js.native
    sealed trait default extends SortBy
    
    @js.native
    sealed trait duration extends SortBy
    
    @js.native
    sealed trait height extends SortBy
    
    @js.native
    sealed trait id extends SortBy
    
    @js.native
    sealed trait mediaType extends SortBy
    
    @js.native
    sealed trait modificationTime extends SortBy
    
    @js.native
    sealed trait width extends SortBy
    
    /* "creationTime" */ val creationTime: typings.expo.expoMod.MediaLibraryNs.SortBy.creationTime with String = js.native
    /* "default" */ val default: typings.expo.expoMod.MediaLibraryNs.SortBy.default with String = js.native
    /* "duration" */ val duration: typings.expo.expoMod.MediaLibraryNs.SortBy.duration with String = js.native
    /* "height" */ val height: typings.expo.expoMod.MediaLibraryNs.SortBy.height with String = js.native
    /* "id" */ val id: typings.expo.expoMod.MediaLibraryNs.SortBy.id with String = js.native
    /* "mediaType" */ val mediaType: typings.expo.expoMod.MediaLibraryNs.SortBy.mediaType with String = js.native
    /* "modificationTime" */ val modificationTime: typings.expo.expoMod.MediaLibraryNs.SortBy.modificationTime with String = js.native
    /* "width" */ val width: typings.expo.expoMod.MediaLibraryNs.SortBy.width with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SortBy with String] = js.native
  }
  
}

