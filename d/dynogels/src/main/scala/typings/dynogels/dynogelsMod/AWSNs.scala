package typings.dynogels.dynogelsMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsDashSdk.clientsAcmMod.ClientConfiguration
import typings.awsDashSdk.clientsDynamodbMod.AttributeMap
import typings.awsDashSdk.clientsDynamodbMod.AttributeValue
import typings.awsDashSdk.libConfigMod.APIVersions
import typings.awsDashSdk.libConfigMod.ConfigurationOptions
import typings.awsDashSdk.libConfigMod.GlobalConfigInstance
import typings.awsDashSdk.libConfigUnderscoreServiceUnderscorePlaceholdersMod.ConfigurationServicePlaceholders
import typings.awsDashSdk.libCredentialsChainableUnderscoreTemporaryUnderscoreCredentialsMod.ChainableTemporaryCredentialsNs.ChainableTemporaryCredentialsOptions
import typings.awsDashSdk.libCredentialsCognitoUnderscoreIdentityUnderscoreCredentialsMod.CognitoIdentityCredentialsNs.CognitoIdentityOptions
import typings.awsDashSdk.libCredentialsCredentialUnderscoreProviderUnderscoreChainMod.provider
import typings.awsDashSdk.libCredentialsEc2UnderscoreMetadataUnderscoreCredentialsMod.EC2MetadataCredentialsOptions
import typings.awsDashSdk.libCredentialsEcsUnderscoreCredentialsMod.ECSCredentialsOptions
import typings.awsDashSdk.libCredentialsMod.CredentialsOptions
import typings.awsDashSdk.libCredentialsProcessUnderscoreCredentialsMod.ProcessCredentialsOptions
import typings.awsDashSdk.libCredentialsRemoteUnderscoreCredentialsMod.RemoteCredentialsOptions
import typings.awsDashSdk.libCredentialsSamlUnderscoreCredentialsMod.SAMLCredentialsParams
import typings.awsDashSdk.libCredentialsSharedUnderscoreIniUnderscoreFileUnderscoreCredentialsMod.SharedIniFileCredentialsOptions
import typings.awsDashSdk.libCredentialsTemporaryUnderscoreCredentialsMod.TemporaryCredentialsNs.TemporaryCredentialsOptions
import typings.awsDashSdk.libCredentialsWebUnderscoreIdentityUnderscoreCredentialsMod.WebIdentityCredentialsNs.WebIdentityCredentialsOptions
import typings.awsDashSdk.libDynamodbConverterMod.ConverterNs.ConverterOptions
import typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.DocumentClientOptions
import typings.awsDashSdk.libMetadataUnderscoreServiceMod.MetadataServiceOptions
import typings.awsDashSdk.libPollyPresignerMod.PresignerNs.PresignerOptions
import typings.awsDashSdk.libRdsSignerMod.SignerNs.SignerOptions
import typings.awsDashSdk.libS3ManagedUnderscoreUploadMod.ManagedUploadNs.ManagedUploadOptions
import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dynogels", "AWS")
@js.native
object AWSNs extends js.Object {
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class ACM ()
    extends typings.awsDashSdk.awsDashSdkMod.ACM {
    def this(options: ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class ACMPCA ()
    extends typings.awsDashSdk.awsDashSdkMod.ACMPCA {
    def this(options: typings.awsDashSdk.clientsAcmpcaMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class APIGateway ()
    extends typings.awsDashSdk.awsDashSdkMod.APIGateway {
    def this(options: typings.awsDashSdk.clientsApigatewayMod.ClientConfiguration) = this()
  }
  
  @js.native
  class AWSError ()
    extends typings.awsDashSdk.awsDashSdkMod.AWSError
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class AlexaForBusiness ()
    extends typings.awsDashSdk.awsDashSdkMod.AlexaForBusiness {
    def this(options: typings.awsDashSdk.clientsAlexaforbusinessMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class Amplify ()
    extends typings.awsDashSdk.awsDashSdkMod.Amplify {
    def this(options: typings.awsDashSdk.clientsAmplifyMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class ApiGatewayManagementApi ()
    extends typings.awsDashSdk.awsDashSdkMod.ApiGatewayManagementApi {
    def this(options: typings.awsDashSdk.clientsApigatewaymanagementapiMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class ApiGatewayV2 ()
    extends typings.awsDashSdk.awsDashSdkMod.ApiGatewayV2 {
    def this(options: typings.awsDashSdk.clientsApigatewayv2Mod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class AppMesh ()
    extends typings.awsDashSdk.awsDashSdkMod.AppMesh {
    def this(options: typings.awsDashSdk.clientsAppmeshMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class AppStream ()
    extends typings.awsDashSdk.awsDashSdkMod.AppStream {
    def this(options: typings.awsDashSdk.clientsAppstreamMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class AppSync ()
    extends typings.awsDashSdk.awsDashSdkMod.AppSync {
    def this(options: typings.awsDashSdk.clientsAppsyncMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class ApplicationAutoScaling ()
    extends typings.awsDashSdk.awsDashSdkMod.ApplicationAutoScaling {
    def this(options: typings.awsDashSdk.clientsApplicationautoscalingMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class ApplicationInsights ()
    extends typings.awsDashSdk.awsDashSdkMod.ApplicationInsights {
    def this(options: typings.awsDashSdk.clientsApplicationinsightsMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class Athena ()
    extends typings.awsDashSdk.awsDashSdkMod.Athena {
    def this(options: typings.awsDashSdk.clientsAthenaMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class AutoScaling ()
    extends typings.awsDashSdk.awsDashSdkMod.AutoScaling {
    def this(options: typings.awsDashSdk.clientsAutoscalingMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class AutoScalingPlans ()
    extends typings.awsDashSdk.awsDashSdkMod.AutoScalingPlans {
    def this(options: typings.awsDashSdk.clientsAutoscalingplansMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class Backup ()
    extends typings.awsDashSdk.awsDashSdkMod.Backup {
    def this(options: typings.awsDashSdk.clientsBackupMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class Batch ()
    extends typings.awsDashSdk.awsDashSdkMod.Batch {
    def this(options: typings.awsDashSdk.clientsBatchMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class Budgets ()
    extends typings.awsDashSdk.clientsBudgetsMod.Budgets {
    def this(options: typings.awsDashSdk.clientsBudgetsMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class CUR ()
    extends typings.awsDashSdk.awsDashSdkMod.CUR {
    def this(options: typings.awsDashSdk.clientsCurMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Creates a new temporary credentials object.
    */
  class ChainableTemporaryCredentials ()
    extends typings.awsDashSdk.awsDashSdkMod.ChainableTemporaryCredentials {
    def this(options: ChainableTemporaryCredentialsOptions) = this()
    def this(
      options: ChainableTemporaryCredentialsOptions,
      masterCredentials: typings.awsDashSdk.libCredentialsMod.Credentials
    ) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class Chime ()
    extends typings.awsDashSdk.awsDashSdkMod.Chime {
    def this(options: typings.awsDashSdk.clientsChimeMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class Cloud9 ()
    extends typings.awsDashSdk.awsDashSdkMod.Cloud9 {
    def this(options: typings.awsDashSdk.clientsCloud9Mod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class CloudDirectory ()
    extends typings.awsDashSdk.awsDashSdkMod.CloudDirectory {
    def this(options: typings.awsDashSdk.clientsClouddirectoryMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class CloudFormation ()
    extends typings.awsDashSdk.awsDashSdkMod.CloudFormation {
    def this(options: typings.awsDashSdk.clientsCloudformationMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class CloudFront ()
    extends typings.awsDashSdk.awsDashSdkMod.CloudFront {
    def this(options: typings.awsDashSdk.clientsCloudfrontMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class CloudHSM ()
    extends typings.awsDashSdk.awsDashSdkMod.CloudHSM {
    def this(options: typings.awsDashSdk.clientsCloudhsmMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class CloudHSMV2 ()
    extends typings.awsDashSdk.awsDashSdkMod.CloudHSMV2 {
    def this(options: typings.awsDashSdk.clientsCloudhsmv2Mod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class CloudSearch ()
    extends typings.awsDashSdk.awsDashSdkMod.CloudSearch {
    def this(options: typings.awsDashSdk.clientsCloudsearchMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class CloudSearchDomain ()
    extends typings.awsDashSdk.awsDashSdkMod.CloudSearchDomain {
    def this(options: typings.awsDashSdk.clientsCloudsearchdomainMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class CloudTrail ()
    extends typings.awsDashSdk.awsDashSdkMod.CloudTrail {
    def this(options: typings.awsDashSdk.clientsCloudtrailMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class CloudWatch ()
    extends typings.awsDashSdk.awsDashSdkMod.CloudWatch {
    def this(options: typings.awsDashSdk.clientsCloudwatchMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class CloudWatchEvents ()
    extends typings.awsDashSdk.awsDashSdkMod.CloudWatchEvents {
    def this(options: typings.awsDashSdk.clientsCloudwatcheventsMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class CloudWatchLogs ()
    extends typings.awsDashSdk.awsDashSdkMod.CloudWatchLogs {
    def this(options: typings.awsDashSdk.clientsCloudwatchlogsMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class CodeBuild ()
    extends typings.awsDashSdk.awsDashSdkMod.CodeBuild {
    def this(options: typings.awsDashSdk.clientsCodebuildMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class CodeCommit ()
    extends typings.awsDashSdk.awsDashSdkMod.CodeCommit {
    def this(options: typings.awsDashSdk.clientsCodecommitMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class CodeDeploy ()
    extends typings.awsDashSdk.awsDashSdkMod.CodeDeploy {
    def this(options: typings.awsDashSdk.clientsCodedeployMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class CodePipeline ()
    extends typings.awsDashSdk.awsDashSdkMod.CodePipeline {
    def this(options: typings.awsDashSdk.clientsCodepipelineMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class CodeStar ()
    extends typings.awsDashSdk.awsDashSdkMod.CodeStar {
    def this(options: typings.awsDashSdk.clientsCodestarMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class CognitoIdentity ()
    extends typings.awsDashSdk.awsDashSdkMod.CognitoIdentity {
    def this(options: typings.awsDashSdk.clientsCognitoidentityMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Creates a new credentials object.
    */
  class CognitoIdentityCredentials ()
    extends typings.awsDashSdk.awsDashSdkMod.CognitoIdentityCredentials {
    /**
      * Creates a new credentials object with optional configuration.
      */
    def this(options: CognitoIdentityOptions) = this()
    def this(options: CognitoIdentityOptions, clientConfig: ConfigurationOptions) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class CognitoIdentityServiceProvider ()
    extends typings.awsDashSdk.awsDashSdkMod.CognitoIdentityServiceProvider {
    def this(options: typings.awsDashSdk.clientsCognitoidentityserviceproviderMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class CognitoSync ()
    extends typings.awsDashSdk.awsDashSdkMod.CognitoSync {
    def this(options: typings.awsDashSdk.clientsCognitosyncMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class Comprehend ()
    extends typings.awsDashSdk.awsDashSdkMod.Comprehend {
    def this(options: typings.awsDashSdk.clientsComprehendMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class ComprehendMedical ()
    extends typings.awsDashSdk.awsDashSdkMod.ComprehendMedical {
    def this(options: typings.awsDashSdk.clientsComprehendmedicalMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Creates a new configuration object.
    * This is the object that passes option data along to service requests, including credentials, security, region information, and some service specific settings.
    */
  class Config ()
    extends typings.awsDashSdk.awsDashSdkMod.Config {
    def this(options: ConfigurationOptions with ConfigurationServicePlaceholders with APIVersions) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class ConfigService ()
    extends typings.awsDashSdk.awsDashSdkMod.ConfigService {
    def this(options: typings.awsDashSdk.clientsConfigserviceMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class Connect ()
    extends typings.awsDashSdk.awsDashSdkMod.Connect {
    def this(options: typings.awsDashSdk.clientsConnectMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class CostExplorer ()
    extends typings.awsDashSdk.awsDashSdkMod.CostExplorer {
    def this(options: typings.awsDashSdk.clientsCostexplorerMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Creates a new CredentialProviderChain with a default set of providers specified by defaultProviders.
    */
  class CredentialProviderChain ()
    extends typings.awsDashSdk.awsDashSdkMod.CredentialProviderChain {
    def this(providers: js.Array[provider]) = this()
  }
  
  @js.native
  class Credentials protected ()
    extends typings.awsDashSdk.awsDashSdkMod.Credentials {
    /**
      * Creates a Credentials object with a given set of credential information as an options hash.
      *
      * @param {object} options - An option hash containing a set of credential information.
      */
    def this(options: CredentialsOptions) = this()
    /**
      * Creates a Credentials object with a given set of credential information as positional arguments.
      *          *
      * @param {string} accessKeyId - The AWS access key ID.
      * @param {string} secretAccessKey - The AWS secret access key.
      * @param {string} sessionToken - The optional AWS session token.
      */
    def this(accessKeyId: String, secretAccessKey: String) = this()
    def this(accessKeyId: String, secretAccessKey: String, sessionToken: String) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class DAX ()
    extends typings.awsDashSdk.awsDashSdkMod.DAX {
    def this(options: typings.awsDashSdk.clientsDaxMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class DLM ()
    extends typings.awsDashSdk.awsDashSdkMod.DLM {
    def this(options: typings.awsDashSdk.clientsDlmMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class DMS ()
    extends typings.awsDashSdk.awsDashSdkMod.DMS {
    def this(options: typings.awsDashSdk.clientsDmsMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class DataPipeline ()
    extends typings.awsDashSdk.awsDashSdkMod.DataPipeline {
    def this(options: typings.awsDashSdk.clientsDatapipelineMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class DataSync ()
    extends typings.awsDashSdk.awsDashSdkMod.DataSync {
    def this(options: typings.awsDashSdk.clientsDatasyncMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class DeviceFarm ()
    extends typings.awsDashSdk.awsDashSdkMod.DeviceFarm {
    def this(options: typings.awsDashSdk.clientsDevicefarmMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class DirectConnect ()
    extends typings.awsDashSdk.awsDashSdkMod.DirectConnect {
    def this(options: typings.awsDashSdk.clientsDirectconnectMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class DirectoryService ()
    extends typings.awsDashSdk.awsDashSdkMod.DirectoryService {
    def this(options: typings.awsDashSdk.clientsDirectoryserviceMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class Discovery ()
    extends typings.awsDashSdk.awsDashSdkMod.Discovery {
    def this(options: typings.awsDashSdk.clientsDiscoveryMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class DocDB ()
    extends typings.awsDashSdk.awsDashSdkMod.DocDB {
    def this(options: typings.awsDashSdk.clientsDocdbMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class DynamoDB ()
    extends typings.awsDashSdk.awsDashSdkMod.DynamoDB {
    def this(options: typings.awsDashSdk.clientsDynamodbMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class DynamoDBStreams ()
    extends typings.awsDashSdk.awsDashSdkMod.DynamoDBStreams {
    def this(options: typings.awsDashSdk.clientsDynamodbstreamsMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class EC2 ()
    extends typings.awsDashSdk.awsDashSdkMod.EC2 {
    def this(options: typings.awsDashSdk.clientsEc2Mod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class EC2InstanceConnect ()
    extends typings.awsDashSdk.awsDashSdkMod.EC2InstanceConnect {
    def this(options: typings.awsDashSdk.clientsEc2instanceconnectMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
  		 * Creates credentials from the metadata service on an EC2 instance.
  		 * @param {object} options - Override the default (1s) timeout period.
  		 */
  class EC2MetadataCredentials ()
    extends typings.awsDashSdk.awsDashSdkMod.EC2MetadataCredentials {
    def this(options: EC2MetadataCredentialsOptions) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class ECR ()
    extends typings.awsDashSdk.awsDashSdkMod.ECR {
    def this(options: typings.awsDashSdk.clientsEcrMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class ECS ()
    extends typings.awsDashSdk.awsDashSdkMod.ECS {
    def this(options: typings.awsDashSdk.clientsEcsMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Represents credentials received.
    * @param {object} options - Override the default (1s) timeout period.
    */
  class ECSCredentials ()
    extends typings.awsDashSdk.awsDashSdkMod.ECSCredentials {
    def this(options: ECSCredentialsOptions) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class EFS ()
    extends typings.awsDashSdk.awsDashSdkMod.EFS {
    def this(options: typings.awsDashSdk.clientsEfsMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class EKS ()
    extends typings.awsDashSdk.awsDashSdkMod.EKS {
    def this(options: typings.awsDashSdk.clientsEksMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class ELB ()
    extends typings.awsDashSdk.awsDashSdkMod.ELB {
    def this(options: typings.awsDashSdk.clientsElbMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class ELBv2 ()
    extends typings.awsDashSdk.awsDashSdkMod.ELBv2 {
    def this(options: typings.awsDashSdk.clientsElbv2Mod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class EMR ()
    extends typings.awsDashSdk.awsDashSdkMod.EMR {
    def this(options: typings.awsDashSdk.clientsEmrMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class ES ()
    extends typings.awsDashSdk.awsDashSdkMod.ES {
    def this(options: typings.awsDashSdk.clientsEsMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class ElastiCache ()
    extends typings.awsDashSdk.awsDashSdkMod.ElastiCache {
    def this(options: typings.awsDashSdk.clientsElasticacheMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class ElasticBeanstalk ()
    extends typings.awsDashSdk.awsDashSdkMod.ElasticBeanstalk {
    def this(options: typings.awsDashSdk.clientsElasticbeanstalkMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class ElasticTranscoder ()
    extends typings.awsDashSdk.awsDashSdkMod.ElasticTranscoder {
    def this(options: typings.awsDashSdk.clientsElastictranscoderMod.ClientConfiguration) = this()
  }
  
  @js.native
  class Endpoint protected ()
    extends typings.awsDashSdk.awsDashSdkMod.Endpoint {
    /**
      * Constructs a new endpoint given an endpoint URL.
      */
    def this(url: String) = this()
  }
  
  @js.native
  class EnvironmentCredentials protected ()
    extends typings.awsDashSdk.awsDashSdkMod.EnvironmentCredentials {
    /**
      * Creates a new EnvironmentCredentials class with a given variable prefix envPrefix.
      * @param {string} envPrefix - The prefix for the environment variable names excluding the separating underscore.
      */
    def this(envPrefix: String) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class EventBridge ()
    extends typings.awsDashSdk.awsDashSdkMod.EventBridge {
    def this(options: typings.awsDashSdk.clientsEventbridgeMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class FMS ()
    extends typings.awsDashSdk.awsDashSdkMod.FMS {
    def this(options: typings.awsDashSdk.clientsFmsMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class FSx ()
    extends typings.awsDashSdk.awsDashSdkMod.FSx {
    def this(options: typings.awsDashSdk.clientsFsxMod.ClientConfiguration) = this()
  }
  
  @js.native
  class FileSystemCredentials protected ()
    extends typings.awsDashSdk.awsDashSdkMod.FileSystemCredentials {
    /**
      * Creates a new FileSystemCredentials object from a filename.
      * @param {string} filename - The path on disk to the JSON file to load.
      */
    def this(filename: String) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class Firehose ()
    extends typings.awsDashSdk.awsDashSdkMod.Firehose {
    def this(options: typings.awsDashSdk.clientsFirehoseMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class GameLift ()
    extends typings.awsDashSdk.awsDashSdkMod.GameLift {
    def this(options: typings.awsDashSdk.clientsGameliftMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class Glacier ()
    extends typings.awsDashSdk.awsDashSdkMod.Glacier {
    def this(options: typings.awsDashSdk.clientsGlacierMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class GlobalAccelerator ()
    extends typings.awsDashSdk.awsDashSdkMod.GlobalAccelerator {
    def this(options: typings.awsDashSdk.clientsGlobalacceleratorMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class Glue ()
    extends typings.awsDashSdk.awsDashSdkMod.Glue {
    def this(options: typings.awsDashSdk.clientsGlueMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class Greengrass ()
    extends typings.awsDashSdk.awsDashSdkMod.Greengrass {
    def this(options: typings.awsDashSdk.clientsGreengrassMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class GroundStation ()
    extends typings.awsDashSdk.awsDashSdkMod.GroundStation {
    def this(options: typings.awsDashSdk.clientsGroundstationMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class GuardDuty ()
    extends typings.awsDashSdk.awsDashSdkMod.GuardDuty {
    def this(options: typings.awsDashSdk.clientsGuarddutyMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class Health ()
    extends typings.awsDashSdk.awsDashSdkMod.Health {
    def this(options: typings.awsDashSdk.clientsHealthMod.ClientConfiguration) = this()
  }
  
  @js.native
  class HttpRequest protected ()
    extends typings.awsDashSdk.awsDashSdkMod.HttpRequest {
    /**
      * Constructs HttpRequest object with provided endpoint and region
      */
    def this(endpoint: typings.awsDashSdk.libEndpointMod.Endpoint, region: String) = this()
  }
  
  @js.native
  class HttpResponse ()
    extends typings.awsDashSdk.awsDashSdkMod.HttpResponse
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class IAM ()
    extends typings.awsDashSdk.awsDashSdkMod.IAM {
    def this(options: typings.awsDashSdk.clientsIamMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class ImportExport ()
    extends typings.awsDashSdk.awsDashSdkMod.ImportExport {
    def this(options: typings.awsDashSdk.clientsImportexportMod.ClientConfiguration) = this()
  }
  
  @js.native
  class IniLoader ()
    extends typings.awsDashSdk.awsDashSdkMod.IniLoader
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class Inspector ()
    extends typings.awsDashSdk.awsDashSdkMod.Inspector {
    def this(options: typings.awsDashSdk.clientsInspectorMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class IoT1ClickDevicesService ()
    extends typings.awsDashSdk.awsDashSdkMod.IoT1ClickDevicesService {
    def this(options: typings.awsDashSdk.clientsIot1clickdevicesserviceMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class IoT1ClickProjects ()
    extends typings.awsDashSdk.awsDashSdkMod.IoT1ClickProjects {
    def this(options: typings.awsDashSdk.clientsIot1clickprojectsMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class IoTAnalytics ()
    extends typings.awsDashSdk.awsDashSdkMod.IoTAnalytics {
    def this(options: typings.awsDashSdk.clientsIotanalyticsMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class IoTEvents ()
    extends typings.awsDashSdk.awsDashSdkMod.IoTEvents {
    def this(options: typings.awsDashSdk.clientsIoteventsMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class IoTEventsData ()
    extends typings.awsDashSdk.awsDashSdkMod.IoTEventsData {
    def this(options: typings.awsDashSdk.clientsIoteventsdataMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class IoTJobsDataPlane ()
    extends typings.awsDashSdk.awsDashSdkMod.IoTJobsDataPlane {
    def this(options: typings.awsDashSdk.clientsIotjobsdataplaneMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class IoTThingsGraph ()
    extends typings.awsDashSdk.awsDashSdkMod.IoTThingsGraph {
    def this(options: typings.awsDashSdk.clientsIotthingsgraphMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class Iot ()
    extends typings.awsDashSdk.awsDashSdkMod.Iot {
    def this(options: typings.awsDashSdk.clientsIotMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class IotData ()
    extends typings.awsDashSdk.awsDashSdkMod.IotData {
    def this(options: typings.awsDashSdk.clientsIotdataMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class KMS ()
    extends typings.awsDashSdk.awsDashSdkMod.KMS {
    def this(options: typings.awsDashSdk.clientsKmsMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class Kafka ()
    extends typings.awsDashSdk.awsDashSdkMod.Kafka {
    def this(options: typings.awsDashSdk.clientsKafkaMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class Kinesis ()
    extends typings.awsDashSdk.awsDashSdkMod.Kinesis {
    def this(options: typings.awsDashSdk.clientsKinesisMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class KinesisAnalytics ()
    extends typings.awsDashSdk.awsDashSdkMod.KinesisAnalytics {
    def this(options: typings.awsDashSdk.clientsKinesisanalyticsMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class KinesisAnalyticsV2 ()
    extends typings.awsDashSdk.awsDashSdkMod.KinesisAnalyticsV2 {
    def this(options: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class KinesisVideo ()
    extends typings.awsDashSdk.awsDashSdkMod.KinesisVideo {
    def this(options: typings.awsDashSdk.clientsKinesisvideoMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class KinesisVideoArchivedMedia ()
    extends typings.awsDashSdk.awsDashSdkMod.KinesisVideoArchivedMedia {
    def this(options: typings.awsDashSdk.clientsKinesisvideoarchivedmediaMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class KinesisVideoMedia ()
    extends typings.awsDashSdk.awsDashSdkMod.KinesisVideoMedia {
    def this(options: typings.awsDashSdk.clientsKinesisvideomediaMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class LakeFormation ()
    extends typings.awsDashSdk.awsDashSdkMod.LakeFormation {
    def this(options: typings.awsDashSdk.clientsLakeformationMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class Lambda ()
    extends typings.awsDashSdk.awsDashSdkMod.Lambda {
    def this(options: typings.awsDashSdk.clientsLambdaMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class LexModelBuildingService ()
    extends typings.awsDashSdk.awsDashSdkMod.LexModelBuildingService {
    def this(options: typings.awsDashSdk.clientsLexmodelbuildingserviceMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class LexRuntime ()
    extends typings.awsDashSdk.awsDashSdkMod.LexRuntime {
    def this(options: typings.awsDashSdk.clientsLexruntimeMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class LicenseManager ()
    extends typings.awsDashSdk.awsDashSdkMod.LicenseManager {
    def this(options: typings.awsDashSdk.clientsLicensemanagerMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class Lightsail ()
    extends typings.awsDashSdk.awsDashSdkMod.Lightsail {
    def this(options: typings.awsDashSdk.clientsLightsailMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class MQ ()
    extends typings.awsDashSdk.awsDashSdkMod.MQ {
    def this(options: typings.awsDashSdk.clientsMqMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class MTurk ()
    extends typings.awsDashSdk.awsDashSdkMod.MTurk {
    def this(options: typings.awsDashSdk.clientsMturkMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class MachineLearning ()
    extends typings.awsDashSdk.awsDashSdkMod.MachineLearning {
    def this(options: typings.awsDashSdk.clientsMachinelearningMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class Macie ()
    extends typings.awsDashSdk.awsDashSdkMod.Macie {
    def this(options: typings.awsDashSdk.clientsMacieMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class ManagedBlockchain ()
    extends typings.awsDashSdk.awsDashSdkMod.ManagedBlockchain {
    def this(options: typings.awsDashSdk.clientsManagedblockchainMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class MarketplaceCommerceAnalytics ()
    extends typings.awsDashSdk.awsDashSdkMod.MarketplaceCommerceAnalytics {
    def this(options: typings.awsDashSdk.clientsMarketplacecommerceanalyticsMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class MarketplaceEntitlementService ()
    extends typings.awsDashSdk.awsDashSdkMod.MarketplaceEntitlementService {
    def this(options: typings.awsDashSdk.clientsMarketplaceentitlementserviceMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class MarketplaceMetering ()
    extends typings.awsDashSdk.awsDashSdkMod.MarketplaceMetering {
    def this(options: typings.awsDashSdk.clientsMarketplacemeteringMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class MediaConnect ()
    extends typings.awsDashSdk.awsDashSdkMod.MediaConnect {
    def this(options: typings.awsDashSdk.clientsMediaconnectMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class MediaConvert ()
    extends typings.awsDashSdk.awsDashSdkMod.MediaConvert {
    def this(options: typings.awsDashSdk.clientsMediaconvertMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class MediaLive ()
    extends typings.awsDashSdk.awsDashSdkMod.MediaLive {
    def this(options: typings.awsDashSdk.clientsMedialiveMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class MediaPackage ()
    extends typings.awsDashSdk.awsDashSdkMod.MediaPackage {
    def this(options: typings.awsDashSdk.clientsMediapackageMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class MediaPackageVod ()
    extends typings.awsDashSdk.awsDashSdkMod.MediaPackageVod {
    def this(options: typings.awsDashSdk.clientsMediapackagevodMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class MediaStore ()
    extends typings.awsDashSdk.awsDashSdkMod.MediaStore {
    def this(options: typings.awsDashSdk.clientsMediastoreMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class MediaStoreData ()
    extends typings.awsDashSdk.awsDashSdkMod.MediaStoreData {
    def this(options: typings.awsDashSdk.clientsMediastoredataMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class MediaTailor ()
    extends typings.awsDashSdk.awsDashSdkMod.MediaTailor {
    def this(options: typings.awsDashSdk.clientsMediatailorMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Creates a new MetadataService object with a given set of options.
    */
  class MetadataService ()
    extends typings.awsDashSdk.awsDashSdkMod.MetadataService {
    def this(options: MetadataServiceOptions) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class MigrationHub ()
    extends typings.awsDashSdk.awsDashSdkMod.MigrationHub {
    def this(options: typings.awsDashSdk.clientsMigrationhubMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class Mobile ()
    extends typings.awsDashSdk.awsDashSdkMod.Mobile {
    def this(options: typings.awsDashSdk.clientsMobileMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class MobileAnalytics ()
    extends typings.awsDashSdk.awsDashSdkMod.MobileAnalytics {
    def this(options: typings.awsDashSdk.clientsMobileanalyticsMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class Neptune ()
    extends typings.awsDashSdk.awsDashSdkMod.Neptune {
    def this(options: typings.awsDashSdk.clientsNeptuneMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class OpsWorks ()
    extends typings.awsDashSdk.awsDashSdkMod.OpsWorks {
    def this(options: typings.awsDashSdk.clientsOpsworksMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class OpsWorksCM ()
    extends typings.awsDashSdk.awsDashSdkMod.OpsWorksCM {
    def this(options: typings.awsDashSdk.clientsOpsworkscmMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class Organizations ()
    extends typings.awsDashSdk.awsDashSdkMod.Organizations {
    def this(options: typings.awsDashSdk.clientsOrganizationsMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class PI ()
    extends typings.awsDashSdk.awsDashSdkMod.PI {
    def this(options: typings.awsDashSdk.clientsPiMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class Personalize ()
    extends typings.awsDashSdk.awsDashSdkMod.Personalize {
    def this(options: typings.awsDashSdk.clientsPersonalizeMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class PersonalizeEvents ()
    extends typings.awsDashSdk.awsDashSdkMod.PersonalizeEvents {
    def this(options: typings.awsDashSdk.clientsPersonalizeeventsMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class PersonalizeRuntime ()
    extends typings.awsDashSdk.awsDashSdkMod.PersonalizeRuntime {
    def this(options: typings.awsDashSdk.clientsPersonalizeruntimeMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class Pinpoint ()
    extends typings.awsDashSdk.awsDashSdkMod.Pinpoint {
    def this(options: typings.awsDashSdk.clientsPinpointMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class PinpointEmail ()
    extends typings.awsDashSdk.awsDashSdkMod.PinpointEmail {
    def this(options: typings.awsDashSdk.clientsPinpointemailMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class PinpointSMSVoice ()
    extends typings.awsDashSdk.awsDashSdkMod.PinpointSMSVoice {
    def this(options: typings.awsDashSdk.clientsPinpointsmsvoiceMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class Polly ()
    extends typings.awsDashSdk.awsDashSdkMod.Polly {
    def this(options: typings.awsDashSdk.clientsPollyMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class Pricing ()
    extends typings.awsDashSdk.awsDashSdkMod.Pricing {
    def this(options: typings.awsDashSdk.clientsPricingMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Creates a new ProcessCredentials object.
    */
  class ProcessCredentials ()
    extends typings.awsDashSdk.awsDashSdkMod.ProcessCredentials {
    def this(options: ProcessCredentialsOptions) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class QuickSight ()
    extends typings.awsDashSdk.awsDashSdkMod.QuickSight {
    def this(options: typings.awsDashSdk.clientsQuicksightMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class RAM ()
    extends typings.awsDashSdk.awsDashSdkMod.RAM {
    def this(options: typings.awsDashSdk.clientsRamMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class RDS ()
    extends typings.awsDashSdk.awsDashSdkMod.RDS {
    def this(options: typings.awsDashSdk.clientsRdsMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class RDSDataService ()
    extends typings.awsDashSdk.awsDashSdkMod.RDSDataService {
    def this(options: typings.awsDashSdk.clientsRdsdataserviceMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class Redshift ()
    extends typings.awsDashSdk.awsDashSdkMod.Redshift {
    def this(options: typings.awsDashSdk.clientsRedshiftMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class Rekognition ()
    extends typings.awsDashSdk.awsDashSdkMod.Rekognition {
    def this(options: typings.awsDashSdk.clientsRekognitionMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Represents credentials received.
    * @param {object} options - Override the default (1s) timeout period.
    */
  class RemoteCredentials ()
    extends typings.awsDashSdk.awsDashSdkMod.RemoteCredentials {
    def this(options: RemoteCredentialsOptions) = this()
  }
  
  @js.native
  class Request[D, E] protected ()
    extends typings.awsDashSdk.awsDashSdkMod.Request[D, E] {
    /**
      * Creates a request for an operation on a given service with a set of input parameters.
      *
      * @param {AWS.Service} service - The service to perform the operation on.
      * @param {string} operation - The operation to perform on the service.
      * @param {object} params - Parameters to send to the operation.
      */
    def this(service: typings.awsDashSdk.libServiceMod.Service, operation: String) = this()
    def this(service: typings.awsDashSdk.libServiceMod.Service, operation: String, params: js.Any) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class ResourceGroups ()
    extends typings.awsDashSdk.awsDashSdkMod.ResourceGroups {
    def this(options: typings.awsDashSdk.clientsResourcegroupsMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class ResourceGroupsTaggingAPI ()
    extends typings.awsDashSdk.awsDashSdkMod.ResourceGroupsTaggingAPI {
    def this(options: typings.awsDashSdk.clientsResourcegroupstaggingapiMod.ClientConfiguration) = this()
  }
  
  @js.native
  class Response[D, E] ()
    extends typings.awsDashSdk.awsDashSdkMod.Response[D, E]
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class RoboMaker ()
    extends typings.awsDashSdk.awsDashSdkMod.RoboMaker {
    def this(options: typings.awsDashSdk.clientsRobomakerMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class Route53 ()
    extends typings.awsDashSdk.awsDashSdkMod.Route53 {
    def this(options: typings.awsDashSdk.clientsRoute53Mod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class Route53Domains ()
    extends typings.awsDashSdk.awsDashSdkMod.Route53Domains {
    def this(options: typings.awsDashSdk.clientsRoute53domainsMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class Route53Resolver ()
    extends typings.awsDashSdk.awsDashSdkMod.Route53Resolver {
    def this(options: typings.awsDashSdk.clientsRoute53resolverMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class S3 ()
    extends typings.awsDashSdk.awsDashSdkMod.S3 {
    def this(options: typings.awsDashSdk.clientsS3Mod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class S3Control ()
    extends typings.awsDashSdk.awsDashSdkMod.S3Control {
    def this(options: typings.awsDashSdk.clientsS3controlMod.ClientConfiguration) = this()
  }
  
  @js.native
  class SAMLCredentials protected ()
    extends typings.awsDashSdk.awsDashSdkMod.SAMLCredentials {
    /**
    		 * Creates a new credentials object.
    		 * @param {object} params - The map of params passed to AWS.STS.assumeRoleWithSAML().
    		 */
    def this(params: SAMLCredentialsParams) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class SES ()
    extends typings.awsDashSdk.awsDashSdkMod.SES {
    def this(options: typings.awsDashSdk.clientsSesMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class SMS ()
    extends typings.awsDashSdk.awsDashSdkMod.SMS {
    def this(options: typings.awsDashSdk.clientsSmsMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class SNS ()
    extends typings.awsDashSdk.awsDashSdkMod.SNS {
    def this(options: typings.awsDashSdk.clientsSnsMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class SQS ()
    extends typings.awsDashSdk.awsDashSdkMod.SQS {
    def this(options: typings.awsDashSdk.clientsSqsMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class SSM ()
    extends typings.awsDashSdk.awsDashSdkMod.SSM {
    def this(options: typings.awsDashSdk.clientsSsmMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class STS ()
    extends typings.awsDashSdk.awsDashSdkMod.STS {
    def this(options: typings.awsDashSdk.clientsStsMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class SWF ()
    extends typings.awsDashSdk.awsDashSdkMod.SWF {
    def this(options: typings.awsDashSdk.clientsSwfMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class SageMaker ()
    extends typings.awsDashSdk.awsDashSdkMod.SageMaker {
    def this(options: typings.awsDashSdk.clientsSagemakerMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class SageMakerRuntime ()
    extends typings.awsDashSdk.awsDashSdkMod.SageMakerRuntime {
    def this(options: typings.awsDashSdk.clientsSagemakerruntimeMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class SecretsManager ()
    extends typings.awsDashSdk.awsDashSdkMod.SecretsManager {
    def this(options: typings.awsDashSdk.clientsSecretsmanagerMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class SecurityHub ()
    extends typings.awsDashSdk.awsDashSdkMod.SecurityHub {
    def this(options: typings.awsDashSdk.clientsSecurityhubMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class ServerlessApplicationRepository ()
    extends typings.awsDashSdk.awsDashSdkMod.ServerlessApplicationRepository {
    def this(options: typings.awsDashSdk.clientsServerlessapplicationrepositoryMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Creates a new service object with a configuration object.
    */
  class Service ()
    extends typings.awsDashSdk.awsDashSdkMod.Service {
    def this(config: ServiceConfigurationOptions) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class ServiceCatalog ()
    extends typings.awsDashSdk.awsDashSdkMod.ServiceCatalog {
    def this(options: typings.awsDashSdk.clientsServicecatalogMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class ServiceDiscovery ()
    extends typings.awsDashSdk.awsDashSdkMod.ServiceDiscovery {
    def this(options: typings.awsDashSdk.clientsServicediscoveryMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class ServiceQuotas ()
    extends typings.awsDashSdk.awsDashSdkMod.ServiceQuotas {
    def this(options: typings.awsDashSdk.clientsServicequotasMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Creates a new SharedIniFileCredentials object.
    */
  class SharedIniFileCredentials ()
    extends typings.awsDashSdk.awsDashSdkMod.SharedIniFileCredentials {
    def this(options: SharedIniFileCredentialsOptions) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class Shield ()
    extends typings.awsDashSdk.awsDashSdkMod.Shield {
    def this(options: typings.awsDashSdk.clientsShieldMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class Signer ()
    extends typings.awsDashSdk.awsDashSdkMod.Signer {
    def this(options: typings.awsDashSdk.clientsSignerMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class SimpleDB ()
    extends typings.awsDashSdk.awsDashSdkMod.SimpleDB {
    def this(options: typings.awsDashSdk.clientsSimpledbMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class Snowball ()
    extends typings.awsDashSdk.awsDashSdkMod.Snowball {
    def this(options: typings.awsDashSdk.clientsSnowballMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class StepFunctions ()
    extends typings.awsDashSdk.awsDashSdkMod.StepFunctions {
    def this(options: typings.awsDashSdk.clientsStepfunctionsMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class StorageGateway ()
    extends typings.awsDashSdk.awsDashSdkMod.StorageGateway {
    def this(options: typings.awsDashSdk.clientsStoragegatewayMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class Support ()
    extends typings.awsDashSdk.awsDashSdkMod.Support {
    def this(options: typings.awsDashSdk.clientsSupportMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Creates a new temporary credentials object.
    * @param {Object} options - a map of options that are passed to the AWS.STS.assumeRole() or AWS.STS.getSessionToken() operations. If a RoleArn parameter is passed in, credentials will be based on the IAM role.
    */
  class TemporaryCredentials ()
    extends typings.awsDashSdk.awsDashSdkMod.TemporaryCredentials {
    /**
      * Creates a new temporary credentials object.
      * @param {Object} options - a map of options that are passed to the AWS.STS.assumeRole() or AWS.STS.getSessionToken() operations. If a RoleArn parameter is passed in, credentials will be based on the IAM role.
      * @param {Object} masterCredentials - The master (non-temporary) credentials used to get and refresh credentials from AWS STS.
      */
    def this(options: TemporaryCredentialsOptions) = this()
    def this(
      options: TemporaryCredentialsOptions,
      masterCredentials: typings.awsDashSdk.libCredentialsMod.Credentials
    ) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class Textract ()
    extends typings.awsDashSdk.awsDashSdkMod.Textract {
    def this(options: typings.awsDashSdk.clientsTextractMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class TranscribeService ()
    extends typings.awsDashSdk.awsDashSdkMod.TranscribeService {
    def this(options: typings.awsDashSdk.clientsTranscribeserviceMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class Transfer ()
    extends typings.awsDashSdk.awsDashSdkMod.Transfer {
    def this(options: typings.awsDashSdk.clientsTransferMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class Translate ()
    extends typings.awsDashSdk.awsDashSdkMod.Translate {
    def this(options: typings.awsDashSdk.clientsTranslateMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class WAF ()
    extends typings.awsDashSdk.awsDashSdkMod.WAF {
    def this(options: typings.awsDashSdk.clientsWafMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class WAFRegional ()
    extends typings.awsDashSdk.awsDashSdkMod.WAFRegional {
    def this(options: typings.awsDashSdk.clientsWafregionalMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Creates a new credentials object.
    * @param {string} options - a map of options that are passed to the AWS.STS.assumeRole() or AWS.STS.getSessionToken() operations. If a RoleArn parameter is passed in, credentials will be based on the IAM role.
    */
  class WebIdentityCredentials ()
    extends typings.awsDashSdk.awsDashSdkMod.WebIdentityCredentials {
    /**
      * Creates a new credentials object with optional configuraion.
      * @param {Object} options - a map of options that are passed to the AWS.STS.assumeRole() or AWS.STS.getSessionToken() operations. If a RoleArn parameter is passed in, credentials will be based on the IAM role.
      * @param {Object} clientConfig - a map of configuration options to pass to the underlying STS client.
      */
    def this(options: WebIdentityCredentialsOptions) = this()
    def this(options: WebIdentityCredentialsOptions, clientConfig: ConfigurationOptions) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class WorkDocs ()
    extends typings.awsDashSdk.awsDashSdkMod.WorkDocs {
    def this(options: typings.awsDashSdk.clientsWorkdocsMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class WorkLink ()
    extends typings.awsDashSdk.awsDashSdkMod.WorkLink {
    def this(options: typings.awsDashSdk.clientsWorklinkMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class WorkMail ()
    extends typings.awsDashSdk.awsDashSdkMod.WorkMail {
    def this(options: typings.awsDashSdk.clientsWorkmailMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class WorkSpaces ()
    extends typings.awsDashSdk.awsDashSdkMod.WorkSpaces {
    def this(options: typings.awsDashSdk.clientsWorkspacesMod.ClientConfiguration) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class XRay ()
    extends typings.awsDashSdk.awsDashSdkMod.XRay {
    def this(options: typings.awsDashSdk.clientsXrayMod.ClientConfiguration) = this()
  }
  
  var config: GlobalConfigInstance = js.native
  // Needed to expose interfaces on the class
  @JSName("ChainableTemporaryCredentials")
  @js.native
  object ChainableTemporaryCredentialsNs extends js.Object
  
  @JSName("CloudFront")
  @js.native
  object CloudFrontNs extends js.Object {
    @js.native
    class Signer protected ()
      extends typings.awsDashSdk.awsDashSdkMod.CloudFrontNs.Signer {
      /**
        * A signer object can be used to generate signed URLs and cookies for granting access to content on restricted CloudFront distributions.
        * 
        * @param {string} keyPairId - The ID of the CloudFront key pair being used.
        * @param {string} privateKey - A private key in RSA format.
        */
      def this(keyPairId: String, privateKey: String) = this()
    }
    
  }
  
  // Needed to expose interfaces on the class
  @JSName("CognitoIdentityCredentials")
  @js.native
  object CognitoIdentityCredentialsNs extends js.Object
  
  /* static members */
  @js.native
  object CredentialProviderChain extends js.Object {
    var defaultProviders: js.Array[provider] = js.native
  }
  
  /* static members */
  @js.native
  object Credentials extends js.Object {
    var expiryWindow: Double = js.native
  }
  
  @JSName("DynamoDB")
  @js.native
  object DynamoDBNs extends js.Object {
    @js.native
    class Converter ()
      extends typings.awsDashSdk.awsDashSdkMod.DynamoDBNs.Converter
    
    @js.native
    /**
      * Creates a DynamoDB document client with a set of configuration options.
      */
    class DocumentClient ()
      extends typings.awsDashSdk.awsDashSdkMod.DynamoDBNs.DocumentClient {
      def this(options: DocumentClientOptions with typings.awsDashSdk.clientsDynamodbMod.ClientConfiguration) = this()
    }
    
    /* static members */
    @js.native
    object Converter extends js.Object {
      def input(data: js.Any): AttributeValue = js.native
      def input(data: js.Any, options: ConverterOptions): AttributeValue = js.native
      def marshall(data: StringDictionary[js.Any]): AttributeMap = js.native
      def marshall(data: StringDictionary[js.Any], options: ConverterOptions): AttributeMap = js.native
      def output(data: AttributeValue): js.Any = js.native
      def output(data: AttributeValue, options: ConverterOptions): js.Any = js.native
      def unmarshall(data: AttributeMap): StringDictionary[js.Any] = js.native
      def unmarshall(data: AttributeMap, options: ConverterOptions): StringDictionary[js.Any] = js.native
    }
    
  }
  
  @JSName("EventListeners")
  @js.native
  object EventListenersNs extends js.Object {
    @JSName("Core")
    @js.native
    object CoreNs extends js.Object {
      def HTTP_DATA(): Unit = js.native
      def SEND(): Unit = js.native
      def VALIDATE_CREDENTIALS(): Unit = js.native
      def VALIDATE_PARAMETERS(): Unit = js.native
      def VALIDATE_REGION(): Unit = js.native
      def removeListener(eventName: String, eventListener: js.Function): Unit = js.native
    }
    
  }
  
  /* static members */
  @js.native
  object MetadataService extends js.Object {
    /**
      * 169.254.169.254
      */
    var host: String = js.native
  }
  
  @JSName("Polly")
  @js.native
  object PollyNs extends js.Object {
    @js.native
    /**
      * Creates a presigner object with a set of configuration options.
      */
    class Presigner ()
      extends typings.awsDashSdk.awsDashSdkMod.PollyNs.Presigner {
      def this(options: PresignerOptions) = this()
    }
    
  }
  
  @JSName("RDS")
  @js.native
  object RDSNs extends js.Object {
    @js.native
    /**
      * A signer object can be used to generate an auth token to a database.
      */
    class Signer ()
      extends typings.awsDashSdk.awsDashSdkMod.RDSNs.Signer {
      def this(options: SignerOptions) = this()
    }
    
  }
  
  @JSName("S3")
  @js.native
  object S3Ns extends js.Object {
    @js.native
    class ManagedUpload protected ()
      extends typings.awsDashSdk.awsDashSdkMod.S3Ns.ManagedUpload {
      /**
        * Creates a managed upload object with a set of configuration options.
        */
      def this(options: ManagedUploadOptions) = this()
    }
    
    @js.native
    class PresignedPost ()
      extends typings.awsDashSdk.awsDashSdkMod.S3Ns.PresignedPost
    
    /* static members */
    @js.native
    object ManagedUpload extends js.Object {
      /**
        * Default value: 10000
        */
      var maxTotalParts: Double = js.native
      /**
        * Returns the minimum number of bytes for an individual part upload.
        * Note: Minimum allowed size is 5 MB.
        * 1024 * 5
        */
      var minPartSize: Double = js.native
    }
    
  }
  
  // Needed to expose interfaces on the class
  @JSName("TemporaryCredentials")
  @js.native
  object TemporaryCredentialsNs extends js.Object
  
  // Needed to expose interfaces on the class
  @JSName("WebIdentityCredentials")
  @js.native
  object WebIdentityCredentialsNs extends js.Object
  
}

