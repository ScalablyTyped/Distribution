package typings
package fhirDashJsDashClientLib.FHIRNs.SMARTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * SMART on FHIR OAuth2 authorization helper methods and settings
         */
@js.native
trait OAuth2 extends js.Object {
  /**
               * Settings to drive the JS client browser behaviour
               */
  var settings: Settings = js.native
  /**
               * Initiate the OAuth2 authorization workflow
               * @param params OAuth2 Configuration
               * @param errback Method which is triggered when an error occurs during the OAuth2 authorization workflow
               */
  def authorize(params: OAuth2Configuration): scala.Unit = js.native
  /**
               * Initiate the OAuth2 authorization workflow
               * @param params OAuth2 Configuration
               * @param errback Method which is triggered when an error occurs during the OAuth2 authorization workflow
               */
  def authorize(params: OAuth2Configuration, errback: js.Function1[/* repeated */js.Any, scala.Unit]): scala.Unit = js.native
  /**
               * Handles the OAuth2 redirect
               * If the URL contains the code parameter, it will complete the token call and pass the SMART client to the callback method
               * @param callback Called once the SMART client is ready to be used.
               * @param errback Called when either the OAuth2 workflow has not been started on an error occured during the OAuth2 workflow.
               */
  def ready(): scala.Unit = js.native
  /**
               * Handles the OAuth2 redirect
               * If the URL contains the code parameter, it will complete the token call and pass the SMART client to the callback method
               * @param callback Called once the SMART client is ready to be used.
               * @param errback Called when either the OAuth2 workflow has not been started on an error occured during the OAuth2 workflow.
               */
  def ready(callback: js.Function1[/* smart */ SMARTClient, scala.Unit]): scala.Unit = js.native
  /**
               * Handles the OAuth2 redirect
               * If the URL contains the code parameter, it will complete the token call and pass the SMART client to the callback method
               * @param callback Called once the SMART client is ready to be used.
               * @param errback Called when either the OAuth2 workflow has not been started on an error occured during the OAuth2 workflow.
               */
  def ready(
    callback: js.Function1[/* smart */ SMARTClient, scala.Unit],
    errback: js.Function1[/* repeated */js.Any, scala.Unit]
  ): scala.Unit = js.native
  /**
               * Resolves the Authorization type of the FHIR server. Can be used to identify if a server supports SMART on FHIR.
               * @param fhirServiceUrl FHIR Server Base URL
               * @param callback Callled once the authorization type is retrieved from the conformance statement.
               * @param errBack Called when an error occured while trying to fetch the conformance statement.
               */
  def resolveAuthType(fhirServiceUrl: java.lang.String): scala.Unit = js.native
  /**
               * Resolves the Authorization type of the FHIR server. Can be used to identify if a server supports SMART on FHIR.
               * @param fhirServiceUrl FHIR Server Base URL
               * @param callback Callled once the authorization type is retrieved from the conformance statement.
               * @param errBack Called when an error occured while trying to fetch the conformance statement.
               */
  def resolveAuthType(fhirServiceUrl: java.lang.String, callback: js.Function1[/* type */ java.lang.String, scala.Unit]): scala.Unit = js.native
  /**
               * Resolves the Authorization type of the FHIR server. Can be used to identify if a server supports SMART on FHIR.
               * @param fhirServiceUrl FHIR Server Base URL
               * @param callback Callled once the authorization type is retrieved from the conformance statement.
               * @param errBack Called when an error occured while trying to fetch the conformance statement.
               */
  def resolveAuthType(
    fhirServiceUrl: java.lang.String,
    callback: js.Function1[/* type */ java.lang.String, scala.Unit],
    errBack: js.Function1[/* type */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
}

