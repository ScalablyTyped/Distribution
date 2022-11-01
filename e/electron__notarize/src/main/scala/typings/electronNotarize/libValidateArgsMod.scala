package typings.electronNotarize

import typings.electronNotarize.libTypesMod.LegacyNotarizeCredentials
import typings.electronNotarize.libTypesMod.NotaryToolCredentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libValidateArgsMod {
  
  @JSImport("@electron/notarize/lib/validate-args", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isLegacyApiKeyCredentials(opts: LegacyNotarizeCredentials): /* is @electron/notarize.@electron/notarize/lib/types.LegacyNotarizeApiKeyCredentials */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLegacyApiKeyCredentials")(opts.asInstanceOf[js.Any]).asInstanceOf[/* is @electron/notarize.@electron/notarize/lib/types.LegacyNotarizeApiKeyCredentials */ Boolean]
  
  inline def isLegacyPasswordCredentials(opts: LegacyNotarizeCredentials): /* is @electron/notarize.@electron/notarize/lib/types.LegacyNotarizePasswordCredentials */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLegacyPasswordCredentials")(opts.asInstanceOf[js.Any]).asInstanceOf[/* is @electron/notarize.@electron/notarize/lib/types.LegacyNotarizePasswordCredentials */ Boolean]
  
  inline def isNotaryToolApiKeyCredentials(opts: NotaryToolCredentials): /* is @electron/notarize.@electron/notarize/lib/types.NotaryToolApiKeyCredentials */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotaryToolApiKeyCredentials")(opts.asInstanceOf[js.Any]).asInstanceOf[/* is @electron/notarize.@electron/notarize/lib/types.NotaryToolApiKeyCredentials */ Boolean]
  
  inline def isNotaryToolKeychainCredentials(opts: NotaryToolCredentials): /* is @electron/notarize.@electron/notarize/lib/types.NotaryToolKeychainCredentials */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotaryToolKeychainCredentials")(opts.asInstanceOf[js.Any]).asInstanceOf[/* is @electron/notarize.@electron/notarize/lib/types.NotaryToolKeychainCredentials */ Boolean]
  
  inline def isNotaryToolPasswordCredentials(opts: NotaryToolCredentials): /* is @electron/notarize.@electron/notarize/lib/types.NotaryToolPasswordCredentials */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotaryToolPasswordCredentials")(opts.asInstanceOf[js.Any]).asInstanceOf[/* is @electron/notarize.@electron/notarize/lib/types.NotaryToolPasswordCredentials */ Boolean]
  
  inline def validateLegacyAuthorizationArgs(opts: LegacyNotarizeCredentials): LegacyNotarizeCredentials = ^.asInstanceOf[js.Dynamic].applyDynamic("validateLegacyAuthorizationArgs")(opts.asInstanceOf[js.Any]).asInstanceOf[LegacyNotarizeCredentials]
  
  inline def validateNotaryToolAuthorizationArgs(opts: NotaryToolCredentials): NotaryToolCredentials = ^.asInstanceOf[js.Dynamic].applyDynamic("validateNotaryToolAuthorizationArgs")(opts.asInstanceOf[js.Any]).asInstanceOf[NotaryToolCredentials]
}
