package typings.forgeApis.mod

import typings.forgeApis.anon.AcceptEncoding
import typings.forgeApis.anon.Height
import typings.forgeApis.anon.Range
import typings.forgeApis.anon.XAdsForce
import typings.forgeApis.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("forge-apis", "DerivativesApi")
@js.native
class DerivativesApi () extends StObject {
  
  /**
    * Deletes the manifest and all its translated output files (derivatives). However, it does not delete the design source file.
    */
  def deleteManifest(urn: String, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  
  /**
    * Downloads a selected derivative. To download the file, you need to specify the file’s URN, which you retrieve by calling the GET {urn}/manifest endpoint.
    * Note that the Model Derivative API uses 2 types of URNs. The design URN is generated when you upload the source design file to Forge, and is used when
    * calling most of the Model Derivative endpoints. A derivative URN is generated for each translated output file format, and is used for downloading the output
    * design files. You can set the range of bytes that are returned when downloading the derivative, using the range header.
    */
  def getDerivativeManifest(urn: String, derivativeUrn: String, opts: Range, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  
  /**
    * Returns an up-to-date list of Forge-supported translations, that you can use to identify which types of derivatives are supported for each source file type.
    * You can set this endpoint to only return the list of supported translations if they have been updated since a specified date. See the Supported Translation
    * Formats table for more details about supported translations. Note that we are constantly adding new file formats to the list of Forge translations.
    */
  def getFormats(opts: AcceptEncoding, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  
  /**
    * Returns information about derivatives that correspond to a specific source file, including derviative URNs and statuses.
    * The URNs of the derivatives are used to download the generated derivatives when calling the GET {urn}/manifest/{derivativeurn}
    * endpoint. The statuses are used to verify whether the translation of requested output files is complete. Note that different
    * output files might complete their translation processes at different times, and therefore may have different `status` values.
    * When translating a source file a second time, the previously created manifest is not deleted; it appends the information
    * (only new translations) to the manifest.
    */
  def getManifest(urn: String, opts: `0`, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  
  /**
    * Returns a list of model view (metadata) IDs for a design model. The metadata ID enables end users to select an object tree
    * and properties for a specific model view. Although most design apps (e.g., Fusion and Inventor) only allow a single model
    * view (object tree and set of properties), some apps (e.g., Revit) allow users to design models with multiple model views
    * (e.g., HVAC, architecture, perspective). Note that you can only retrieve metadata from an input file that has been
    * translated into an SVF file.
    */
  def getMetadata(urn: String, opts: `0`, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  
  /**
    * Returns an object tree, i.e., a hierarchical list of objects for a model view. To call this endpoint you first need to
    * call the GET {urn}/metadata endpoint, to determine which model view (object tree and set of properties) to use. Although
    * most design apps (e.g., Fusion and Inventor) only allow a single model view, some apps (e.g., Revit) allow users to design
    * models with multiple model views (e.g., HVAC, architecture, perspective). Note that you can only retrieve metadata from an
    * input file that has been translated into an SVF file.
    */
  def getModelviewMetadata(urn: String, guid: String, opts: `0`, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  
  /**
    * Returns a list of properties for each object in an object tree. Properties are returned according to object ID and do not
    * follow a hierarchical structure. The following image displays a typical list of properties for a Revit object: To call
    * this endpoint you need to first call the GET {urn}/metadata endpoint, which returns a list of model view (metadata) IDs
    * for a design input model. Select a model view (metadata) ID to use when calling the Get Properties endpoint. Note that
    * you can only get properties from a design input file that was previously translated into an SVF file.
    */
  def getModelviewProperties(urn: String, guid: String, opts: `0`, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  
  /**
    * Returns the thumbnail for the source file.
    */
  def getThumbnail(urn: String, opts: Height, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  
  /**
    * Translate a source file from one format to another. Derivatives are stored in a manifest that is updated each time this endpoint
    * is used on a source file. Note that this endpoint is asynchronous and initiates a process that runs in the background, rather
    * than keeping an open HTTP connection until completion. Use the GET {urn}/manifest endpoint to poll for the job’s completion.
    */
  def translate(job: JobPayload, opts: XAdsForce, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
}
