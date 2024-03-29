package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUsageLogEvent extends StObject {
  
  /**
    * A shell command was issued over ADB via “adb shell command”. Part of SECURITY_LOGS.
    */
  var adbShellCommandEvent: js.UndefOr[SchemaAdbShellCommandEvent] = js.undefined
  
  /**
    * An ADB interactive shell was opened via “adb shell”. Part of SECURITY_LOGS.
    */
  var adbShellInteractiveEvent: js.UndefOr[SchemaAdbShellInteractiveEvent] = js.undefined
  
  /**
    * An app process was started. Part of SECURITY_LOGS.
    */
  var appProcessStartEvent: js.UndefOr[SchemaAppProcessStartEvent] = js.undefined
  
  /**
    * A new root certificate was installed into the system's trusted credential storage. Part of SECURITY_LOGS.
    */
  var certAuthorityInstalledEvent: js.UndefOr[SchemaCertAuthorityInstalledEvent] = js.undefined
  
  /**
    * A root certificate was removed from the system's trusted credential storage. Part of SECURITY_LOGS.
    */
  var certAuthorityRemovedEvent: js.UndefOr[SchemaCertAuthorityRemovedEvent] = js.undefined
  
  /**
    * An X.509v3 certificate failed to validate, currently this validation is performed on the Wi-FI access point and failure may be due to a mismatch upon server certificate validation. However it may in the future include other validation events of an X.509v3 certificate. Part of SECURITY_LOGS.
    */
  var certValidationFailureEvent: js.UndefOr[SchemaCertValidationFailureEvent] = js.undefined
  
  /**
    * A TCP connect event was initiated through the standard network stack. Part of NETWORK_ACTIVITY_LOGS.
    */
  var connectEvent: js.UndefOr[SchemaConnectEvent] = js.undefined
  
  /**
    * Validates whether Android’s built-in cryptographic library (BoringSSL) is valid. Should always succeed on device boot, if it fails, the device should be considered untrusted. Part of SECURITY_LOGS.
    */
  var cryptoSelfTestCompletedEvent: js.UndefOr[SchemaCryptoSelfTestCompletedEvent] = js.undefined
  
  /**
    * A DNS lookup event was initiated through the standard network stack. Part of NETWORK_ACTIVITY_LOGS.
    */
  var dnsEvent: js.UndefOr[SchemaDnsEvent] = js.undefined
  
  /**
    * Unique id of the event.
    */
  var eventId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Device timestamp when the event was logged.
    */
  var eventTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The particular usage log event type that was reported on the device. Use this to determine which event field to access.
    */
  var eventType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A file was downloaded from the device. Part of SECURITY_LOGS.
    */
  var filePulledEvent: js.UndefOr[SchemaFilePulledEvent] = js.undefined
  
  /**
    * A file was uploaded onto the device. Part of SECURITY_LOGS.
    */
  var filePushedEvent: js.UndefOr[SchemaFilePushedEvent] = js.undefined
  
  /**
    * A cryptographic key including user installed, admin installed and system maintained private key is removed from the device either by the user or management. Part of SECURITY_LOGS.
    */
  var keyDestructionEvent: js.UndefOr[SchemaKeyDestructionEvent] = js.undefined
  
  /**
    * A cryptographic key including user installed, admin installed and system maintained private key is installed on the device either by the user or management. Part of SECURITY_LOGS.
    */
  var keyGeneratedEvent: js.UndefOr[SchemaKeyGeneratedEvent] = js.undefined
  
  /**
    * A cryptographic key including user installed, admin installed and system maintained private key is imported on the device either by the user or management. Part of SECURITY_LOGS.
    */
  var keyImportEvent: js.UndefOr[SchemaKeyImportEvent] = js.undefined
  
  /**
    * A cryptographic key including user installed, admin installed and system maintained private key is determined to be corrupted due to storage corruption, hardware failure or some OS issue. Part of SECURITY_LOGS.
    */
  var keyIntegrityViolationEvent: js.UndefOr[SchemaKeyIntegrityViolationEvent] = js.undefined
  
  /**
    * An attempt was made to unlock the device. Part of SECURITY_LOGS.
    */
  var keyguardDismissAuthAttemptEvent: js.UndefOr[SchemaKeyguardDismissAuthAttemptEvent] = js.undefined
  
  /**
    * The keyguard was dismissed. Part of SECURITY_LOGS.
    */
  var keyguardDismissedEvent: js.UndefOr[SchemaKeyguardDismissedEvent] = js.undefined
  
  /**
    * The device was locked either by user or timeout. Part of SECURITY_LOGS.
    */
  var keyguardSecuredEvent: js.UndefOr[SchemaKeyguardSecuredEvent] = js.undefined
  
  /**
    * The audit log buffer has reached 90% of its capacity, therefore older events may be dropped. Part of SECURITY_LOGS.
    */
  var logBufferSizeCriticalEvent: js.UndefOr[SchemaLogBufferSizeCriticalEvent] = js.undefined
  
  /**
    * usageLog policy has been enabled. Part of SECURITY_LOGS.
    */
  var loggingStartedEvent: js.UndefOr[SchemaLoggingStartedEvent] = js.undefined
  
  /**
    * usageLog policy has been disabled. Part of SECURITY_LOGS.
    */
  var loggingStoppedEvent: js.UndefOr[SchemaLoggingStoppedEvent] = js.undefined
  
  /**
    * Removable media was mounted. Part of SECURITY_LOGS.
    */
  var mediaMountEvent: js.UndefOr[SchemaMediaMountEvent] = js.undefined
  
  /**
    * Removable media was unmounted. Part of SECURITY_LOGS.
    */
  var mediaUnmountEvent: js.UndefOr[SchemaMediaUnmountEvent] = js.undefined
  
  /**
    * Device was shutdown. Part of SECURITY_LOGS.
    */
  var osShutdownEvent: js.UndefOr[SchemaOsShutdownEvent] = js.undefined
  
  /**
    * Device was started. Part of SECURITY_LOGS.
    */
  var osStartupEvent: js.UndefOr[SchemaOsStartupEvent] = js.undefined
  
  /**
    * The device or profile has been remotely locked via the LOCK command. Part of SECURITY_LOGS.
    */
  var remoteLockEvent: js.UndefOr[SchemaRemoteLockEvent] = js.undefined
  
  /**
    * The work profile or company-owned device failed to wipe when requested. This could be user initiated or admin initiated e.g. delete was received. Part of SECURITY_LOGS.
    */
  var wipeFailureEvent: js.UndefOr[SchemaWipeFailureEvent] = js.undefined
}
object SchemaUsageLogEvent {
  
  inline def apply(): SchemaUsageLogEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUsageLogEvent]
  }
  
  extension [Self <: SchemaUsageLogEvent](x: Self) {
    
    inline def setAdbShellCommandEvent(value: SchemaAdbShellCommandEvent): Self = StObject.set(x, "adbShellCommandEvent", value.asInstanceOf[js.Any])
    
    inline def setAdbShellCommandEventUndefined: Self = StObject.set(x, "adbShellCommandEvent", js.undefined)
    
    inline def setAdbShellInteractiveEvent(value: SchemaAdbShellInteractiveEvent): Self = StObject.set(x, "adbShellInteractiveEvent", value.asInstanceOf[js.Any])
    
    inline def setAdbShellInteractiveEventUndefined: Self = StObject.set(x, "adbShellInteractiveEvent", js.undefined)
    
    inline def setAppProcessStartEvent(value: SchemaAppProcessStartEvent): Self = StObject.set(x, "appProcessStartEvent", value.asInstanceOf[js.Any])
    
    inline def setAppProcessStartEventUndefined: Self = StObject.set(x, "appProcessStartEvent", js.undefined)
    
    inline def setCertAuthorityInstalledEvent(value: SchemaCertAuthorityInstalledEvent): Self = StObject.set(x, "certAuthorityInstalledEvent", value.asInstanceOf[js.Any])
    
    inline def setCertAuthorityInstalledEventUndefined: Self = StObject.set(x, "certAuthorityInstalledEvent", js.undefined)
    
    inline def setCertAuthorityRemovedEvent(value: SchemaCertAuthorityRemovedEvent): Self = StObject.set(x, "certAuthorityRemovedEvent", value.asInstanceOf[js.Any])
    
    inline def setCertAuthorityRemovedEventUndefined: Self = StObject.set(x, "certAuthorityRemovedEvent", js.undefined)
    
    inline def setCertValidationFailureEvent(value: SchemaCertValidationFailureEvent): Self = StObject.set(x, "certValidationFailureEvent", value.asInstanceOf[js.Any])
    
    inline def setCertValidationFailureEventUndefined: Self = StObject.set(x, "certValidationFailureEvent", js.undefined)
    
    inline def setConnectEvent(value: SchemaConnectEvent): Self = StObject.set(x, "connectEvent", value.asInstanceOf[js.Any])
    
    inline def setConnectEventUndefined: Self = StObject.set(x, "connectEvent", js.undefined)
    
    inline def setCryptoSelfTestCompletedEvent(value: SchemaCryptoSelfTestCompletedEvent): Self = StObject.set(x, "cryptoSelfTestCompletedEvent", value.asInstanceOf[js.Any])
    
    inline def setCryptoSelfTestCompletedEventUndefined: Self = StObject.set(x, "cryptoSelfTestCompletedEvent", js.undefined)
    
    inline def setDnsEvent(value: SchemaDnsEvent): Self = StObject.set(x, "dnsEvent", value.asInstanceOf[js.Any])
    
    inline def setDnsEventUndefined: Self = StObject.set(x, "dnsEvent", js.undefined)
    
    inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setEventIdNull: Self = StObject.set(x, "eventId", null)
    
    inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
    
    inline def setEventTime(value: String): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
    
    inline def setEventTimeNull: Self = StObject.set(x, "eventTime", null)
    
    inline def setEventTimeUndefined: Self = StObject.set(x, "eventTime", js.undefined)
    
    inline def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setEventTypeNull: Self = StObject.set(x, "eventType", null)
    
    inline def setEventTypeUndefined: Self = StObject.set(x, "eventType", js.undefined)
    
    inline def setFilePulledEvent(value: SchemaFilePulledEvent): Self = StObject.set(x, "filePulledEvent", value.asInstanceOf[js.Any])
    
    inline def setFilePulledEventUndefined: Self = StObject.set(x, "filePulledEvent", js.undefined)
    
    inline def setFilePushedEvent(value: SchemaFilePushedEvent): Self = StObject.set(x, "filePushedEvent", value.asInstanceOf[js.Any])
    
    inline def setFilePushedEventUndefined: Self = StObject.set(x, "filePushedEvent", js.undefined)
    
    inline def setKeyDestructionEvent(value: SchemaKeyDestructionEvent): Self = StObject.set(x, "keyDestructionEvent", value.asInstanceOf[js.Any])
    
    inline def setKeyDestructionEventUndefined: Self = StObject.set(x, "keyDestructionEvent", js.undefined)
    
    inline def setKeyGeneratedEvent(value: SchemaKeyGeneratedEvent): Self = StObject.set(x, "keyGeneratedEvent", value.asInstanceOf[js.Any])
    
    inline def setKeyGeneratedEventUndefined: Self = StObject.set(x, "keyGeneratedEvent", js.undefined)
    
    inline def setKeyImportEvent(value: SchemaKeyImportEvent): Self = StObject.set(x, "keyImportEvent", value.asInstanceOf[js.Any])
    
    inline def setKeyImportEventUndefined: Self = StObject.set(x, "keyImportEvent", js.undefined)
    
    inline def setKeyIntegrityViolationEvent(value: SchemaKeyIntegrityViolationEvent): Self = StObject.set(x, "keyIntegrityViolationEvent", value.asInstanceOf[js.Any])
    
    inline def setKeyIntegrityViolationEventUndefined: Self = StObject.set(x, "keyIntegrityViolationEvent", js.undefined)
    
    inline def setKeyguardDismissAuthAttemptEvent(value: SchemaKeyguardDismissAuthAttemptEvent): Self = StObject.set(x, "keyguardDismissAuthAttemptEvent", value.asInstanceOf[js.Any])
    
    inline def setKeyguardDismissAuthAttemptEventUndefined: Self = StObject.set(x, "keyguardDismissAuthAttemptEvent", js.undefined)
    
    inline def setKeyguardDismissedEvent(value: SchemaKeyguardDismissedEvent): Self = StObject.set(x, "keyguardDismissedEvent", value.asInstanceOf[js.Any])
    
    inline def setKeyguardDismissedEventUndefined: Self = StObject.set(x, "keyguardDismissedEvent", js.undefined)
    
    inline def setKeyguardSecuredEvent(value: SchemaKeyguardSecuredEvent): Self = StObject.set(x, "keyguardSecuredEvent", value.asInstanceOf[js.Any])
    
    inline def setKeyguardSecuredEventUndefined: Self = StObject.set(x, "keyguardSecuredEvent", js.undefined)
    
    inline def setLogBufferSizeCriticalEvent(value: SchemaLogBufferSizeCriticalEvent): Self = StObject.set(x, "logBufferSizeCriticalEvent", value.asInstanceOf[js.Any])
    
    inline def setLogBufferSizeCriticalEventUndefined: Self = StObject.set(x, "logBufferSizeCriticalEvent", js.undefined)
    
    inline def setLoggingStartedEvent(value: SchemaLoggingStartedEvent): Self = StObject.set(x, "loggingStartedEvent", value.asInstanceOf[js.Any])
    
    inline def setLoggingStartedEventUndefined: Self = StObject.set(x, "loggingStartedEvent", js.undefined)
    
    inline def setLoggingStoppedEvent(value: SchemaLoggingStoppedEvent): Self = StObject.set(x, "loggingStoppedEvent", value.asInstanceOf[js.Any])
    
    inline def setLoggingStoppedEventUndefined: Self = StObject.set(x, "loggingStoppedEvent", js.undefined)
    
    inline def setMediaMountEvent(value: SchemaMediaMountEvent): Self = StObject.set(x, "mediaMountEvent", value.asInstanceOf[js.Any])
    
    inline def setMediaMountEventUndefined: Self = StObject.set(x, "mediaMountEvent", js.undefined)
    
    inline def setMediaUnmountEvent(value: SchemaMediaUnmountEvent): Self = StObject.set(x, "mediaUnmountEvent", value.asInstanceOf[js.Any])
    
    inline def setMediaUnmountEventUndefined: Self = StObject.set(x, "mediaUnmountEvent", js.undefined)
    
    inline def setOsShutdownEvent(value: SchemaOsShutdownEvent): Self = StObject.set(x, "osShutdownEvent", value.asInstanceOf[js.Any])
    
    inline def setOsShutdownEventUndefined: Self = StObject.set(x, "osShutdownEvent", js.undefined)
    
    inline def setOsStartupEvent(value: SchemaOsStartupEvent): Self = StObject.set(x, "osStartupEvent", value.asInstanceOf[js.Any])
    
    inline def setOsStartupEventUndefined: Self = StObject.set(x, "osStartupEvent", js.undefined)
    
    inline def setRemoteLockEvent(value: SchemaRemoteLockEvent): Self = StObject.set(x, "remoteLockEvent", value.asInstanceOf[js.Any])
    
    inline def setRemoteLockEventUndefined: Self = StObject.set(x, "remoteLockEvent", js.undefined)
    
    inline def setWipeFailureEvent(value: SchemaWipeFailureEvent): Self = StObject.set(x, "wipeFailureEvent", value.asInstanceOf[js.Any])
    
    inline def setWipeFailureEventUndefined: Self = StObject.set(x, "wipeFailureEvent", js.undefined)
  }
}
