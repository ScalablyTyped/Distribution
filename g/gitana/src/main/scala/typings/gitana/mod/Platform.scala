package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "Platform")
@js.native
open class Platform protected () extends StObject {
  def this(cluster: Any, `object`: Any) = this()
  
  def accessChecks(entries: Any, callback: Any): Any = js.native
  
  def accessLookups(entries: Any, callback: Any): Any = js.native
  
  def adminIndexDatastores(): Any = js.native
  
  def adminRepair(): Any = js.native
  
  def app(settings: Any, callback: Any): Any = js.native
  
  def assignAccessPolicy(accessPolicyId: Any, ref: Any): Any = js.native
  
  def authenticate(config: Any, authFailureHandler: Any): Any = js.native
  
  def base(): Unit = js.native
  
  def checkApplicationAuthorities(checks: Any, callback: Any): Any = js.native
  
  def checkApplicationPermissions(checks: Any, callback: Any): Any = js.native
  
  def checkAuthenticationGrantAuthorities(checks: Any, callback: Any): Any = js.native
  
  def checkAuthenticationGrantPermissions(checks: Any, callback: Any): Any = js.native
  
  def checkBillingProviderConfigurationAuthorities(checks: Any, callback: Any): Any = js.native
  
  def checkBillingProviderConfigurationPermissions(checks: Any, callback: Any): Any = js.native
  
  def checkClientAuthorities(checks: Any, callback: Any): Any = js.native
  
  def checkClientPermissions(checks: Any, callback: Any): Any = js.native
  
  def checkDeploymentPackageAuthorities(checks: Any, callback: Any): Any = js.native
  
  def checkDeploymentPackagePermissions(checks: Any, callback: Any): Any = js.native
  
  def checkDeploymentReceiverAuthorities(checks: Any, callback: Any): Any = js.native
  
  def checkDeploymentReceiverPermissions(checks: Any, callback: Any): Any = js.native
  
  def checkDeploymentStrategyAuthorities(checks: Any, callback: Any): Any = js.native
  
  def checkDeploymentStrategyPermissions(checks: Any, callback: Any): Any = js.native
  
  def checkDeploymentTargetAuthorities(checks: Any, callback: Any): Any = js.native
  
  def checkDeploymentTargetPermissions(checks: Any, callback: Any): Any = js.native
  
  def checkDirectoryAuthorities(checks: Any, callback: Any): Any = js.native
  
  def checkDirectoryPermissions(checks: Any, callback: Any): Any = js.native
  
  def checkDomainAuthorities(checks: Any, callback: Any): Any = js.native
  
  def checkDomainPermissions(checks: Any, callback: Any): Any = js.native
  
  def checkProjectAuthorities(checks: Any, callback: Any): Any = js.native
  
  def checkProjectPermissions(checks: Any, callback: Any): Any = js.native
  
  def checkRegistrarAuthorities(checks: Any, callback: Any): Any = js.native
  
  def checkRegistrarPermissions(checks: Any, callback: Any): Any = js.native
  
  def checkReportAuthorities(checks: Any, callback: Any): Any = js.native
  
  def checkReportPermissions(checks: Any, callback: Any): Any = js.native
  
  def checkRepositoryAuthorities(checks: Any, callback: Any): Any = js.native
  
  def checkRepositoryPermissions(checks: Any, callback: Any): Any = js.native
  
  def checkScheduledWorkAuthorities(checks: Any, callback: Any): Any = js.native
  
  def checkScheduledWorkPermissions(checks: Any, callback: Any): Any = js.native
  
  def checkServiceDescriptorAuthorities(checks: Any, callback: Any): Any = js.native
  
  def checkServiceDescriptorPermissions(checks: Any, callback: Any): Any = js.native
  
  def checkStackAuthorities(checks: Any, callback: Any): Any = js.native
  
  def checkStackPermissions(checks: Any, callback: Any): Any = js.native
  
  def checkUIConfigAuthorities(checks: Any, callback: Any): Any = js.native
  
  def checkUIConfigPermissions(checks: Any, callback: Any): Any = js.native
  
  def checkVaultAuthorities(checks: Any, callback: Any): Any = js.native
  
  def checkVaultPermissions(checks: Any, callback: Any): Any = js.native
  
  def checkViewAuthorities(checks: Any, callback: Any): Any = js.native
  
  def checkViewPermissions(checks: Any, callback: Any): Any = js.native
  
  def checkWebHostAuthorities(checks: Any, callback: Any): Any = js.native
  
  def checkWebHostPermissions(checks: Any, callback: Any): Any = js.native
  
  def checkWorkflowCommentAuthorities(checks: Any, callback: Any): Any = js.native
  
  def checkWorkflowCommentPermissions(checks: Any, callback: Any): Any = js.native
  
  def checkWorkflowInstanceAuthorities(checks: Any, callback: Any): Any = js.native
  
  def checkWorkflowInstancePermissions(checks: Any, callback: Any): Any = js.native
  
  def checkWorkflowModelAuthorities(checks: Any, callback: Any): Any = js.native
  
  def checkWorkflowModelPermissions(checks: Any, callback: Any): Any = js.native
  
  def checkWorkflowTaskAuthorities(checks: Any, callback: Any): Any = js.native
  
  def checkWorkflowTaskPermissions(checks: Any, callback: Any): Any = js.native
  
  def createAccessPolicy(`object`: Any): Any = js.native
  
  def createApplication(`object`: Any): Any = js.native
  
  def createAuthenticationGrant(`object`: Any): Any = js.native
  
  def createBillingProviderConfiguration(providerId: Any, `object`: Any): Any = js.native
  
  def createClient(`object`: Any): Any = js.native
  
  def createDeploymentReceiver(`object`: Any): Any = js.native
  
  def createDeploymentStrategy(`object`: Any): Any = js.native
  
  def createDeploymentTarget(`object`: Any): Any = js.native
  
  def createDirectory(`object`: Any): Any = js.native
  
  def createDomain(`object`: Any): Any = js.native
  
  def createLogEntry(message: Any, level: Any, obj: Any): Any = js.native
  
  def createProject(`object`: Any): Any = js.native
  
  def createRegistrar(`object`: Any): Any = js.native
  
  def createReport(`object`: Any): Any = js.native
  
  def createRepository(`object`: Any): Any = js.native
  
  def createScheduledWorkItem(`object`: Any): Any = js.native
  
  def createServiceDescriptor(`object`: Any): Any = js.native
  
  def createStack(`object`: Any): Any = js.native
  
  def createUIConfig(`object`: Any): Any = js.native
  
  def createVault(`object`: Any): Any = js.native
  
  def createView(`object`: Any): Any = js.native
  
  def createWebHost(`object`: Any): Any = js.native
  
  def createWorkflow(workflowModelId: Any, `object`: Any): Any = js.native
  
  def createWorkflowComment(workflowId: Any, workflowTaskId: Any, `object`: Any): Any = js.native
  
  def createWorkflowModel(id: Any, `object`: Any): Any = js.native
  
  def del(): Any = js.native
  
  def executeReport(reportId: Any, config: Any, pagination: Any, callback: Any): Any = js.native
  
  def exportDownloadUrl(exportId: Any, index: Any, useDispositionHeader: Any): Any = js.native
  
  def findAccessPolicies(ref: Any, pagination: Any): Any = js.native
  
  def findStackForDataStore(datastoreType: Any, datastoreId: Any): Any = js.native
  
  def getPlatform(): Any = js.native
  
  def getTenantPreviewUri(name: Any, config: Any): Any = js.native
  
  def getType(): Any = js.native
  
  def getUri(): Any = js.native
  
  def listAccessPolicies(pagination: Any): Any = js.native
  
  def listAccessPolicyTargets(accessPolicyId: Any, pagination: Any): Any = js.native
  
  def listAllWorkflowModels(pagination: Any): Any = js.native
  
  def listApplicationTypes(pagination: Any): Any = js.native
  
  def listApplications(pagination: Any): Any = js.native
  
  def listBillingProviderConfigurations(pagination: Any): Any = js.native
  
  def listClients(pagination: Any): Any = js.native
  
  def listDeploymentPackages(pagination: Any): Any = js.native
  
  def listDeploymentReceivers(pagination: Any): Any = js.native
  
  def listDeploymentStrategies(pagination: Any): Any = js.native
  
  def listDeploymentTargets(pagination: Any): Any = js.native
  
  def listDirectories(pagination: Any): Any = js.native
  
  def listDomains(pagination: Any): Any = js.native
  
  def listProjectTypes(pagination: Any): Any = js.native
  
  def listProjects(pagination: Any): Any = js.native
  
  def listRegistrars(pagination: Any): Any = js.native
  
  def listReports(pagination: Any): Any = js.native
  
  def listRepositories(pagination: Any): Any = js.native
  
  def listRuleActions(pagination: Any, callback: Any): Any = js.native
  
  def listRuleConditions(pagination: Any, callback: Any): Any = js.native
  
  def listScheduledWorkItems(pagination: Any): Any = js.native
  
  def listServiceDescriptors(pagination: Any): Any = js.native
  
  def listStacks(pagination: Any): Any = js.native
  
  def listTasksForCurrentUser(filter: Any, pagination: Any): Any = js.native
  
  def listTenantAttachments(): Any = js.native
  
  def listUIConfigs(pagination: Any): Any = js.native
  
  def listVaults(pagination: Any): Any = js.native
  
  def listViews(pagination: Any): Any = js.native
  
  def listWebHosts(pagination: Any): Any = js.native
  
  def listWorkflowComments(pagination: Any): Any = js.native
  
  def listWorkflowModelVersions(id: Any, pagination: Any): Any = js.native
  
  def listWorkflowModels(pagination: Any): Any = js.native
  
  def listWorkflowTasks(pagination: Any): Any = js.native
  
  def listWorkflows(pagination: Any): Any = js.native
  
  def loadInfo(callback: Any): Any = js.native
  
  def loadWorkflowHistory(workflowId: Any, pagination: Any, callback: Any): Any = js.native
  
  def logout(expireAccessToken: Any): Any = js.native
  
  def postLogEntry(message: Any, level: Any, obj: Any): Any = js.native
  
  def queryAccessPolicies(query: Any, pagination: Any): Any = js.native
  
  def queryAllWorkflowModels(query: Any, pagination: Any): Any = js.native
  
  def queryApplications(query: Any, pagination: Any): Any = js.native
  
  def queryAuthenticationGrants(query: Any, pagination: Any): Any = js.native
  
  def queryBillingProviderConfigurations(query: Any, pagination: Any): Any = js.native
  
  def queryClients(query: Any, pagination: Any): Any = js.native
  
  def queryDeploymentPackages(query: Any, pagination: Any): Any = js.native
  
  def queryDeploymentReceivers(query: Any, pagination: Any): Any = js.native
  
  def queryDeploymentStrategies(query: Any, pagination: Any): Any = js.native
  
  def queryDeploymentTargets(query: Any, pagination: Any): Any = js.native
  
  def queryDirectories(query: Any, pagination: Any): Any = js.native
  
  def queryDomains(query: Any, pagination: Any): Any = js.native
  
  def queryLogEntries(query: Any, pagination: Any): Any = js.native
  
  def queryProjects(query: Any, pagination: Any): Any = js.native
  
  def queryRegistrars(query: Any, pagination: Any): Any = js.native
  
  def queryReports(query: Any, pagination: Any): Any = js.native
  
  def queryRepositories(query: Any, pagination: Any): Any = js.native
  
  def queryScheduledWorkItems(query: Any, pagination: Any): Any = js.native
  
  def queryServiceDescriptors(query: Any, pagination: Any): Any = js.native
  
  def queryStacks(query: Any, pagination: Any): Any = js.native
  
  def queryTasks(query: Any, pagination: Any): Any = js.native
  
  def queryTasksForCurrentUser(filter: Any, query: Any, pagination: Any): Any = js.native
  
  def queryUIConfigs(query: Any, pagination: Any): Any = js.native
  
  def queryVaults(query: Any, pagination: Any): Any = js.native
  
  def queryViews(query: Any, pagination: Any): Any = js.native
  
  def queryWebHosts(query: Any, pagination: Any): Any = js.native
  
  def queryWorkflowComments(query: Any, pagination: Any): Any = js.native
  
  def queryWorkflowModelVersions(id: Any, query: Any, pagination: Any): Any = js.native
  
  def queryWorkflowModels(query: Any, pagination: Any): Any = js.native
  
  def queryWorkflowTasks(query: Any, pagination: Any): Any = js.native
  
  def queryWorkflows(query: Any, pagination: Any): Any = js.native
  
  def readAccessPolicy(accessPolicyId: Any): Any = js.native
  
  def readApplication(applicationId: Any): Any = js.native
  
  def readAuthenticationGrant(authenticationGrantId: Any): Any = js.native
  
  def readBillingProviderConfiguration(billingProviderConfigurationId: Any): Any = js.native
  
  def readClient(clientId: Any): Any = js.native
  
  def readCluster(): Any = js.native
  
  def readDeploymentPackage(deploymentPackageId: Any): Any = js.native
  
  def readDeploymentReceiver(deploymentReceiverId: Any): Any = js.native
  
  def readDeploymentStrategy(deploymentStrategyId: Any): Any = js.native
  
  def readDeploymentTarget(deploymentTargetId: Any): Any = js.native
  
  def readDirectory(directoryId: Any): Any = js.native
  
  def readDomain(domainId: Any): Any = js.native
  
  def readExportStatus(exportId: Any, callback: Any): Any = js.native
  
  def readLog(callback: Any): Any = js.native
  
  def readLogEntry(logEntryId: Any): Any = js.native
  
  def readPrimaryDomain(): Any = js.native
  
  def readProject(projectId: Any): Any = js.native
  
  def readRegistrar(registrarId: Any): Any = js.native
  
  def readReport(reportId: Any): Any = js.native
  
  def readRepository(repositoryId: Any): Any = js.native
  
  def readRuleAction(actionId: Any, callback: Any): Any = js.native
  
  def readRuleCondition(conditionId: Any, callback: Any): Any = js.native
  
  def readScheduledWorkItem(scheduledWorkId: Any): Any = js.native
  
  def readServiceDescriptor(descriptorId: Any): Any = js.native
  
  def readStack(stackId: Any): Any = js.native
  
  def readUIConfig(uiConfigId: Any): Any = js.native
  
  def readVault(vaultId: Any): Any = js.native
  
  def readView(viewId: Any): Any = js.native
  
  def readWebHost(webhostId: Any): Any = js.native
  
  def readWorkflow(workflowId: Any): Any = js.native
  
  def readWorkflowComment(workflowCommentId: Any): Any = js.native
  
  def readWorkflowModel(workflowModelId: Any, workflowModelVersionId: Any): Any = js.native
  
  def readWorkflowTask(workflowTaskId: Any): Any = js.native
  
  def referenceDiff(sourceRef: Any, targetRef: Any, callback: Any): Any = js.native
  
  def referenceMerge(sourceRef: Any, diffObject: Any, callback: Any): Any = js.native
  
  def referenceReads(entries: Any, callback: Any): Any = js.native
  
  def reload(): Any = js.native
  
  def runExport(objects: Any, configuration: Any, callback: Any): Any = js.native
  
  def startCreateProject(`object`: Any, params: Any, callback: Any): Any = js.native
  
  def tenantAttach(attachmentId: Any, contentType: Any, data: Any): Any = js.native
  
  def tenantAttachment(attachmentId: Any): Any = js.native
  
  def tenantUnattach(attachmentId: Any): Any = js.native
  
  def unassignAccessPolicy(accessPolicyId: Any, ref: Any): Any = js.native
  
  def unassignAllAccessPolicies(ref: Any): Any = js.native
  
  def update(): Any = js.native
}
object Platform {
  
  @JSImport("gitana", "Platform")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(_instance: Any, _static: Any, args: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")((scala.List(_instance.asInstanceOf[js.Any], _static.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
  
  /* static member */
  inline def forEach(`object`: Any, block: Any, context: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(`object`.asInstanceOf[js.Any], block.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def implement(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("implement")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  /* static member */
  inline def toString_(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[Any]
  
  /* static member */
  inline def valueOf_(`type`: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("valueOf")(`type`.asInstanceOf[js.Any]).asInstanceOf[Any]
}
