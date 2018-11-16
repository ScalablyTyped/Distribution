package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.JDBCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JdbcDatabaseMetaData extends js.Object {
  def allProceduresAreCallable(): scala.Boolean = js.native
  def allTablesAreSelectable(): scala.Boolean = js.native
  def autoCommitFailureClosesAllResultSets(): scala.Boolean = js.native
  def dataDefinitionCausesTransactionCommit(): scala.Boolean = js.native
  def dataDefinitionIgnoredInTransactions(): scala.Boolean = js.native
  def deletesAreDetected(`type`: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Boolean = js.native
  def doesMaxRowSizeIncludeBlobs(): scala.Boolean = js.native
  def getAttributes(
    catalog: java.lang.String,
    schemaPattern: java.lang.String,
    typeNamePattern: java.lang.String,
    attributeNamePattern: java.lang.String
  ): JdbcResultSet = js.native
  def getBestRowIdentifier(
    catalog: java.lang.String,
    schema: java.lang.String,
    table: java.lang.String,
    scope: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    nullable: scala.Boolean
  ): JdbcResultSet = js.native
  def getCatalogSeparator(): java.lang.String = js.native
  def getCatalogTerm(): java.lang.String = js.native
  def getCatalogs(): JdbcResultSet = js.native
  def getClientInfoProperties(): JdbcResultSet = js.native
  def getColumnPrivileges(
    catalog: java.lang.String,
    schema: java.lang.String,
    table: java.lang.String,
    columnNamePattern: java.lang.String
  ): JdbcResultSet = js.native
  def getColumns(
    catalog: java.lang.String,
    schemaPattern: java.lang.String,
    tableNamePattern: java.lang.String,
    columnNamePattern: java.lang.String
  ): JdbcResultSet = js.native
  def getConnection(): JdbcConnection = js.native
  def getCrossReference(
    parentCatalog: java.lang.String,
    parentSchema: java.lang.String,
    parentTable: java.lang.String,
    foreignCatalog: java.lang.String,
    foreignSchema: java.lang.String,
    foreignTable: java.lang.String
  ): JdbcResultSet = js.native
  def getDatabaseMajorVersion(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getDatabaseMinorVersion(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getDatabaseProductName(): java.lang.String = js.native
  def getDatabaseProductVersion(): java.lang.String = js.native
  def getDefaultTransactionIsolation(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getDriverMajorVersion(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getDriverMinorVersion(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getDriverName(): java.lang.String = js.native
  def getDriverVersion(): java.lang.String = js.native
  def getExportedKeys(catalog: java.lang.String, schema: java.lang.String, table: java.lang.String): JdbcResultSet = js.native
  def getExtraNameCharacters(): java.lang.String = js.native
  def getFunctionColumns(
    catalog: java.lang.String,
    schemaPattern: java.lang.String,
    functionNamePattern: java.lang.String,
    columnNamePattern: java.lang.String
  ): JdbcResultSet = js.native
  def getFunctions(catalog: java.lang.String, schemaPattern: java.lang.String, functionNamePattern: java.lang.String): JdbcResultSet = js.native
  def getIdentifierQuoteString(): java.lang.String = js.native
  def getImportedKeys(catalog: java.lang.String, schema: java.lang.String, table: java.lang.String): JdbcResultSet = js.native
  def getIndexInfo(
    catalog: java.lang.String,
    schema: java.lang.String,
    table: java.lang.String,
    unique: scala.Boolean,
    approximate: scala.Boolean
  ): JdbcResultSet = js.native
  def getJDBCMajorVersion(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getJDBCMinorVersion(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getMaxBinaryLiteralLength(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getMaxCatalogNameLength(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getMaxCharLiteralLength(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getMaxColumnNameLength(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getMaxColumnsInGroupBy(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getMaxColumnsInIndex(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getMaxColumnsInOrderBy(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getMaxColumnsInSelect(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getMaxColumnsInTable(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getMaxConnections(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getMaxCursorNameLength(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getMaxIndexLength(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getMaxProcedureNameLength(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getMaxRowSize(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getMaxSchemaNameLength(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getMaxStatementLength(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getMaxStatements(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getMaxTableNameLength(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getMaxTablesInSelect(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getMaxUserNameLength(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getNumericFunctions(): java.lang.String = js.native
  def getPrimaryKeys(catalog: java.lang.String, schema: java.lang.String, table: java.lang.String): JdbcResultSet = js.native
  def getProcedureColumns(
    catalog: java.lang.String,
    schemaPattern: java.lang.String,
    procedureNamePattern: java.lang.String,
    columnNamePattern: java.lang.String
  ): JdbcResultSet = js.native
  def getProcedureTerm(): java.lang.String = js.native
  def getProcedures(catalog: java.lang.String, schemaPattern: java.lang.String, procedureNamePattern: java.lang.String): JdbcResultSet = js.native
  def getResultSetHoldability(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getRowIdLifetime(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getSQLKeywords(): java.lang.String = js.native
  def getSQLStateType(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getSchemaTerm(): java.lang.String = js.native
  def getSchemas(): JdbcResultSet = js.native
  def getSchemas(catalog: java.lang.String, schemaPattern: java.lang.String): JdbcResultSet = js.native
  def getSearchStringEscape(): java.lang.String = js.native
  def getStringFunctions(): java.lang.String = js.native
  def getSuperTables(catalog: java.lang.String, schemaPattern: java.lang.String, tableNamePattern: java.lang.String): JdbcResultSet = js.native
  def getSuperTypes(catalog: java.lang.String, schemaPattern: java.lang.String, typeNamePattern: java.lang.String): JdbcResultSet = js.native
  def getSystemFunctions(): java.lang.String = js.native
  def getTablePrivileges(catalog: java.lang.String, schemaPattern: java.lang.String, tableNamePattern: java.lang.String): JdbcResultSet = js.native
  def getTableTypes(): JdbcResultSet = js.native
  def getTables(
    catalog: java.lang.String,
    schemaPattern: java.lang.String,
    tableNamePattern: java.lang.String,
    types: js.Array[java.lang.String]
  ): JdbcResultSet = js.native
  def getTimeDateFunctions(): java.lang.String = js.native
  def getTypeInfo(): JdbcResultSet = js.native
  def getUDTs(
    catalog: java.lang.String,
    schemaPattern: java.lang.String,
    typeNamePattern: java.lang.String,
    types: js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer]
  ): JdbcResultSet = js.native
  def getURL(): java.lang.String = js.native
  def getUserName(): java.lang.String = js.native
  def getVersionColumns(catalog: java.lang.String, schema: java.lang.String, table: java.lang.String): JdbcResultSet = js.native
  def insertsAreDetected(`type`: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Boolean = js.native
  def isCatalogAtStart(): scala.Boolean = js.native
  def isReadOnly(): scala.Boolean = js.native
  def locatorsUpdateCopy(): scala.Boolean = js.native
  def nullPlusNonNullIsNull(): scala.Boolean = js.native
  def nullsAreSortedAtEnd(): scala.Boolean = js.native
  def nullsAreSortedAtStart(): scala.Boolean = js.native
  def nullsAreSortedHigh(): scala.Boolean = js.native
  def nullsAreSortedLow(): scala.Boolean = js.native
  def othersDeletesAreVisible(`type`: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Boolean = js.native
  def othersInsertsAreVisible(`type`: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Boolean = js.native
  def othersUpdatesAreVisible(`type`: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Boolean = js.native
  def ownDeletesAreVisible(`type`: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Boolean = js.native
  def ownInsertsAreVisible(`type`: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Boolean = js.native
  def ownUpdatesAreVisible(`type`: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Boolean = js.native
  def storesLowerCaseIdentifiers(): scala.Boolean = js.native
  def storesLowerCaseQuotedIdentifiers(): scala.Boolean = js.native
  def storesMixedCaseIdentifiers(): scala.Boolean = js.native
  def storesMixedCaseQuotedIdentifiers(): scala.Boolean = js.native
  def storesUpperCaseIdentifiers(): scala.Boolean = js.native
  def storesUpperCaseQuotedIdentifiers(): scala.Boolean = js.native
  def supportsANSI92EntryLevelSQL(): scala.Boolean = js.native
  def supportsANSI92FullSQL(): scala.Boolean = js.native
  def supportsANSI92IntermediateSQL(): scala.Boolean = js.native
  def supportsAlterTableWithAddColumn(): scala.Boolean = js.native
  def supportsAlterTableWithDropColumn(): scala.Boolean = js.native
  def supportsBatchUpdates(): scala.Boolean = js.native
  def supportsCatalogsInDataManipulation(): scala.Boolean = js.native
  def supportsCatalogsInIndexDefinitions(): scala.Boolean = js.native
  def supportsCatalogsInPrivilegeDefinitions(): scala.Boolean = js.native
  def supportsCatalogsInProcedureCalls(): scala.Boolean = js.native
  def supportsCatalogsInTableDefinitions(): scala.Boolean = js.native
  def supportsColumnAliasing(): scala.Boolean = js.native
  def supportsConvert(): scala.Boolean = js.native
  def supportsConvert(
    fromType: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    toType: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): scala.Boolean = js.native
  def supportsCoreSQLGrammar(): scala.Boolean = js.native
  def supportsCorrelatedSubqueries(): scala.Boolean = js.native
  def supportsDataDefinitionAndDataManipulationTransactions(): scala.Boolean = js.native
  def supportsDataManipulationTransactionsOnly(): scala.Boolean = js.native
  def supportsDifferentTableCorrelationNames(): scala.Boolean = js.native
  def supportsExpressionsInOrderBy(): scala.Boolean = js.native
  def supportsExtendedSQLGrammar(): scala.Boolean = js.native
  def supportsFullOuterJoins(): scala.Boolean = js.native
  def supportsGetGeneratedKeys(): scala.Boolean = js.native
  def supportsGroupBy(): scala.Boolean = js.native
  def supportsGroupByBeyondSelect(): scala.Boolean = js.native
  def supportsGroupByUnrelated(): scala.Boolean = js.native
  def supportsIntegrityEnhancementFacility(): scala.Boolean = js.native
  def supportsLikeEscapeClause(): scala.Boolean = js.native
  def supportsLimitedOuterJoins(): scala.Boolean = js.native
  def supportsMinimumSQLGrammar(): scala.Boolean = js.native
  def supportsMixedCaseIdentifiers(): scala.Boolean = js.native
  def supportsMixedCaseQuotedIdentifiers(): scala.Boolean = js.native
  def supportsMultipleOpenResults(): scala.Boolean = js.native
  def supportsMultipleResultSets(): scala.Boolean = js.native
  def supportsMultipleTransactions(): scala.Boolean = js.native
  def supportsNamedParameters(): scala.Boolean = js.native
  def supportsNonNullableColumns(): scala.Boolean = js.native
  def supportsOpenCursorsAcrossCommit(): scala.Boolean = js.native
  def supportsOpenCursorsAcrossRollback(): scala.Boolean = js.native
  def supportsOpenStatementsAcrossCommit(): scala.Boolean = js.native
  def supportsOpenStatementsAcrossRollback(): scala.Boolean = js.native
  def supportsOrderByUnrelated(): scala.Boolean = js.native
  def supportsOuterJoins(): scala.Boolean = js.native
  def supportsPositionedDelete(): scala.Boolean = js.native
  def supportsPositionedUpdate(): scala.Boolean = js.native
  def supportsResultSetConcurrency(
    `type`: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    concurrency: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): scala.Boolean = js.native
  def supportsResultSetHoldability(holdability: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Boolean = js.native
  def supportsResultSetType(`type`: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Boolean = js.native
  def supportsSavepoints(): scala.Boolean = js.native
  def supportsSchemasInDataManipulation(): scala.Boolean = js.native
  def supportsSchemasInIndexDefinitions(): scala.Boolean = js.native
  def supportsSchemasInPrivilegeDefinitions(): scala.Boolean = js.native
  def supportsSchemasInProcedureCalls(): scala.Boolean = js.native
  def supportsSchemasInTableDefinitions(): scala.Boolean = js.native
  def supportsSelectForUpdate(): scala.Boolean = js.native
  def supportsStatementPooling(): scala.Boolean = js.native
  def supportsStoredFunctionsUsingCallSyntax(): scala.Boolean = js.native
  def supportsStoredProcedures(): scala.Boolean = js.native
  def supportsSubqueriesInComparisons(): scala.Boolean = js.native
  def supportsSubqueriesInExists(): scala.Boolean = js.native
  def supportsSubqueriesInIns(): scala.Boolean = js.native
  def supportsSubqueriesInQuantifieds(): scala.Boolean = js.native
  def supportsTableCorrelationNames(): scala.Boolean = js.native
  def supportsTransactionIsolationLevel(level: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Boolean = js.native
  def supportsTransactions(): scala.Boolean = js.native
  def supportsUnion(): scala.Boolean = js.native
  def supportsUnionAll(): scala.Boolean = js.native
  def updatesAreDetected(`type`: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Boolean = js.native
  def usesLocalFilePerTable(): scala.Boolean = js.native
  def usesLocalFiles(): scala.Boolean = js.native
}

