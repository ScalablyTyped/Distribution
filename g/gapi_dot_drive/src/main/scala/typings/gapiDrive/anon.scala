package typings.gapiDrive

import typings.gapiDrive.gapiDriveStrings.driveNumbersignuser
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AdditionalRoles extends StObject {
    
    var additionalRoles: js.Array[String]
    
    var inherited: Boolean
    
    var inheritedFrom: String
    
    var role: String
    
    var teamDrivePermissionType: String
  }
  object AdditionalRoles {
    
    @scala.inline
    def apply(
      additionalRoles: js.Array[String],
      inherited: Boolean,
      inheritedFrom: String,
      role: String,
      teamDrivePermissionType: String
    ): AdditionalRoles = {
      val __obj = js.Dynamic.literal(additionalRoles = additionalRoles.asInstanceOf[js.Any], inherited = inherited.asInstanceOf[js.Any], inheritedFrom = inheritedFrom.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], teamDrivePermissionType = teamDrivePermissionType.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdditionalRoles]
    }
    
    @scala.inline
    implicit class AdditionalRolesMutableBuilder[Self <: AdditionalRoles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalRoles(value: js.Array[String]): Self = StObject.set(x, "additionalRoles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalRolesVarargs(value: String*): Self = StObject.set(x, "additionalRoles", js.Array(value :_*))
      
      @scala.inline
      def setInherited(value: Boolean): Self = StObject.set(x, "inherited", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInheritedFrom(value: String): Self = StObject.set(x, "inheritedFrom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamDrivePermissionType(value: String): Self = StObject.set(x, "teamDrivePermissionType", value.asInstanceOf[js.Any])
    }
  }
  
  trait Altitude extends StObject {
    
    var altitude: Double
    
    var latitude: Double
    
    var longitude: Double
  }
  object Altitude {
    
    @scala.inline
    def apply(altitude: Double, latitude: Double, longitude: Double): Altitude = {
      val __obj = js.Dynamic.literal(altitude = altitude.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
      __obj.asInstanceOf[Altitude]
    }
    
    @scala.inline
    implicit class AltitudeMutableBuilder[Self <: Altitude] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    }
  }
  
  trait Aperture extends StObject {
    
    var aperture: Double
    
    var cameraMake: String
    
    var cameraModel: String
    
    var colorSpace: String
    
    var date: String
    
    var exposureBias: Double
    
    var exposureMode: String
    
    var exposureTime: Double
    
    var flashUsed: Boolean
    
    var focalLength: Double
    
    var height: Double
    
    var isoSpeed: Double
    
    var lens: String
    
    var location: Altitude
    
    var maxApertureValue: Double
    
    var meteringMode: String
    
    var rotation: Double
    
    var sensor: String
    
    var subjectDistance: Double
    
    var whiteBalance: String
    
    var width: Double
  }
  object Aperture {
    
    @scala.inline
    def apply(
      aperture: Double,
      cameraMake: String,
      cameraModel: String,
      colorSpace: String,
      date: String,
      exposureBias: Double,
      exposureMode: String,
      exposureTime: Double,
      flashUsed: Boolean,
      focalLength: Double,
      height: Double,
      isoSpeed: Double,
      lens: String,
      location: Altitude,
      maxApertureValue: Double,
      meteringMode: String,
      rotation: Double,
      sensor: String,
      subjectDistance: Double,
      whiteBalance: String,
      width: Double
    ): Aperture = {
      val __obj = js.Dynamic.literal(aperture = aperture.asInstanceOf[js.Any], cameraMake = cameraMake.asInstanceOf[js.Any], cameraModel = cameraModel.asInstanceOf[js.Any], colorSpace = colorSpace.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], exposureBias = exposureBias.asInstanceOf[js.Any], exposureMode = exposureMode.asInstanceOf[js.Any], exposureTime = exposureTime.asInstanceOf[js.Any], flashUsed = flashUsed.asInstanceOf[js.Any], focalLength = focalLength.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isoSpeed = isoSpeed.asInstanceOf[js.Any], lens = lens.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], maxApertureValue = maxApertureValue.asInstanceOf[js.Any], meteringMode = meteringMode.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], sensor = sensor.asInstanceOf[js.Any], subjectDistance = subjectDistance.asInstanceOf[js.Any], whiteBalance = whiteBalance.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Aperture]
    }
    
    @scala.inline
    implicit class ApertureMutableBuilder[Self <: Aperture] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAperture(value: Double): Self = StObject.set(x, "aperture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCameraMake(value: String): Self = StObject.set(x, "cameraMake", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCameraModel(value: String): Self = StObject.set(x, "cameraModel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorSpace(value: String): Self = StObject.set(x, "colorSpace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExposureBias(value: Double): Self = StObject.set(x, "exposureBias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExposureMode(value: String): Self = StObject.set(x, "exposureMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExposureTime(value: Double): Self = StObject.set(x, "exposureTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlashUsed(value: Boolean): Self = StObject.set(x, "flashUsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocalLength(value: Double): Self = StObject.set(x, "focalLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsoSpeed(value: Double): Self = StObject.set(x, "isoSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLens(value: String): Self = StObject.set(x, "lens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: Altitude): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxApertureValue(value: Double): Self = StObject.set(x, "maxApertureValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeteringMode(value: String): Self = StObject.set(x, "meteringMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSensor(value: String): Self = StObject.set(x, "sensor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubjectDistance(value: Double): Self = StObject.set(x, "subjectDistance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhiteBalance(value: String): Self = StObject.set(x, "whiteBalance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait CanAddChildren extends StObject {
    
    var canAddChildren: Boolean
    
    var canChangeRestrictedDownload: Boolean
    
    var canComment: Boolean
    
    var canCopy: Boolean
    
    var canDelete: Boolean
    
    var canDownload: Boolean
    
    var canEdit: Boolean
    
    var canListChildren: Boolean
    
    var canMoveItemIntoTeamDrive: Boolean
    
    var canMoveTeamDriveItem: Boolean
    
    var canReadRevisions: Boolean
    
    var canReadTeamDrive: Boolean
    
    var canRemoveChildren: Boolean
    
    var canRename: Boolean
    
    var canShare: Boolean
    
    var canTrash: Boolean
    
    var canUntrash: Boolean
  }
  object CanAddChildren {
    
    @scala.inline
    def apply(
      canAddChildren: Boolean,
      canChangeRestrictedDownload: Boolean,
      canComment: Boolean,
      canCopy: Boolean,
      canDelete: Boolean,
      canDownload: Boolean,
      canEdit: Boolean,
      canListChildren: Boolean,
      canMoveItemIntoTeamDrive: Boolean,
      canMoveTeamDriveItem: Boolean,
      canReadRevisions: Boolean,
      canReadTeamDrive: Boolean,
      canRemoveChildren: Boolean,
      canRename: Boolean,
      canShare: Boolean,
      canTrash: Boolean,
      canUntrash: Boolean
    ): CanAddChildren = {
      val __obj = js.Dynamic.literal(canAddChildren = canAddChildren.asInstanceOf[js.Any], canChangeRestrictedDownload = canChangeRestrictedDownload.asInstanceOf[js.Any], canComment = canComment.asInstanceOf[js.Any], canCopy = canCopy.asInstanceOf[js.Any], canDelete = canDelete.asInstanceOf[js.Any], canDownload = canDownload.asInstanceOf[js.Any], canEdit = canEdit.asInstanceOf[js.Any], canListChildren = canListChildren.asInstanceOf[js.Any], canMoveItemIntoTeamDrive = canMoveItemIntoTeamDrive.asInstanceOf[js.Any], canMoveTeamDriveItem = canMoveTeamDriveItem.asInstanceOf[js.Any], canReadRevisions = canReadRevisions.asInstanceOf[js.Any], canReadTeamDrive = canReadTeamDrive.asInstanceOf[js.Any], canRemoveChildren = canRemoveChildren.asInstanceOf[js.Any], canRename = canRename.asInstanceOf[js.Any], canShare = canShare.asInstanceOf[js.Any], canTrash = canTrash.asInstanceOf[js.Any], canUntrash = canUntrash.asInstanceOf[js.Any])
      __obj.asInstanceOf[CanAddChildren]
    }
    
    @scala.inline
    implicit class CanAddChildrenMutableBuilder[Self <: CanAddChildren] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanAddChildren(value: Boolean): Self = StObject.set(x, "canAddChildren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanChangeRestrictedDownload(value: Boolean): Self = StObject.set(x, "canChangeRestrictedDownload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanComment(value: Boolean): Self = StObject.set(x, "canComment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanCopy(value: Boolean): Self = StObject.set(x, "canCopy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanDelete(value: Boolean): Self = StObject.set(x, "canDelete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanDownload(value: Boolean): Self = StObject.set(x, "canDownload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanEdit(value: Boolean): Self = StObject.set(x, "canEdit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanListChildren(value: Boolean): Self = StObject.set(x, "canListChildren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanMoveItemIntoTeamDrive(value: Boolean): Self = StObject.set(x, "canMoveItemIntoTeamDrive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanMoveTeamDriveItem(value: Boolean): Self = StObject.set(x, "canMoveTeamDriveItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanReadRevisions(value: Boolean): Self = StObject.set(x, "canReadRevisions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanReadTeamDrive(value: Boolean): Self = StObject.set(x, "canReadTeamDrive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanRemoveChildren(value: Boolean): Self = StObject.set(x, "canRemoveChildren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanRename(value: Boolean): Self = StObject.set(x, "canRename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanShare(value: Boolean): Self = StObject.set(x, "canShare", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanTrash(value: Boolean): Self = StObject.set(x, "canTrash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanUntrash(value: Boolean): Self = StObject.set(x, "canUntrash", value.asInstanceOf[js.Any])
    }
  }
  
  trait DisplayName extends StObject {
    
    var displayName: String
    
    var emailAddress: String
    
    var isAuthenticatedUser: Boolean
    
    var kind: driveNumbersignuser
    
    var permissionId: String
    
    var picture: Url
  }
  object DisplayName {
    
    @scala.inline
    def apply(
      displayName: String,
      emailAddress: String,
      isAuthenticatedUser: Boolean,
      permissionId: String,
      picture: Url
    ): DisplayName = {
      val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], emailAddress = emailAddress.asInstanceOf[js.Any], isAuthenticatedUser = isAuthenticatedUser.asInstanceOf[js.Any], kind = "drive#user", permissionId = permissionId.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisplayName]
    }
    
    @scala.inline
    implicit class DisplayNameMutableBuilder[Self <: DisplayName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAuthenticatedUser(value: Boolean): Self = StObject.set(x, "isAuthenticatedUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKind(value: driveNumbersignuser): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermissionId(value: String): Self = StObject.set(x, "permissionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPicture(value: Url): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
    }
  }
  
  trait DurationMillis extends StObject {
    
    var durationMillis: Double
    
    var height: Double
    
    var width: Double
  }
  object DurationMillis {
    
    @scala.inline
    def apply(durationMillis: Double, height: Double, width: Double): DurationMillis = {
      val __obj = js.Dynamic.literal(durationMillis = durationMillis.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[DurationMillis]
    }
    
    @scala.inline
    implicit class DurationMillisMutableBuilder[Self <: DurationMillis] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDurationMillis(value: Double): Self = StObject.set(x, "durationMillis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Hidden extends StObject {
    
    var hidden: Boolean
    
    var modified: Boolean
    
    var restricted: Boolean
    
    var starred: Boolean
    
    var trashed: Boolean
    
    var viewed: Boolean
  }
  object Hidden {
    
    @scala.inline
    def apply(
      hidden: Boolean,
      modified: Boolean,
      restricted: Boolean,
      starred: Boolean,
      trashed: Boolean,
      viewed: Boolean
    ): Hidden = {
      val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], restricted = restricted.asInstanceOf[js.Any], starred = starred.asInstanceOf[js.Any], trashed = trashed.asInstanceOf[js.Any], viewed = viewed.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hidden]
    }
    
    @scala.inline
    implicit class HiddenMutableBuilder[Self <: Hidden] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModified(value: Boolean): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestricted(value: Boolean): Self = StObject.set(x, "restricted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStarred(value: Boolean): Self = StObject.set(x, "starred", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrashed(value: Boolean): Self = StObject.set(x, "trashed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewed(value: Boolean): Self = StObject.set(x, "viewed", value.asInstanceOf[js.Any])
    }
  }
  
  trait Image extends StObject {
    
    var image: Uint8Array
    
    var mimType: String
  }
  object Image {
    
    @scala.inline
    def apply(image: Uint8Array, mimType: String): Image = {
      val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], mimType = mimType.asInstanceOf[js.Any])
      __obj.asInstanceOf[Image]
    }
    
    @scala.inline
    implicit class ImageMutableBuilder[Self <: Image] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImage(value: Uint8Array): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimType(value: String): Self = StObject.set(x, "mimType", value.asInstanceOf[js.Any])
    }
  }
  
  trait Text extends StObject {
    
    var text: String
  }
  object Text {
    
    @scala.inline
    def apply(text: String): Text = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Text]
    }
    
    @scala.inline
    implicit class TextMutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait Url extends StObject {
    
    var url: String
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
